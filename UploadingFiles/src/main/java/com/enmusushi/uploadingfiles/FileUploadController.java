package com.enmusushi.uploadingfiles;

import com.enmusushi.uploadingfiles.storage.StorageFileNotFoundException;
import com.enmusushi.uploadingfiles.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.stream.Collectors;

/**
 * @author Admin
 */
@Controller
public class FileUploadController {
    private final StorageService storageService;


    @Autowired
    public FileUploadController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/")
    public String listUploadedFiles(Model model) {
        model.addAttribute("files", storageService.loadAll().map(
                path -> MvcUriComponentsBuilder.fromMethodName(FileUploadController.class, "serveFiles", path.getFileName().toString())
                        .build().toUri().toString()).collect(Collectors.toList())
        );
        model.addAttribute("fileContent", storageService.loadAll().map(
                path -> MvcUriComponentsBuilder.fromMethodName(FileUploadController.class, "serveFileContent", path.getFileName().toString())
                        .build().toUri().toString()).collect(Collectors.toList())
        );
        return "uploadForm";

        /*model.addAttribute("files", storageService.loadAll().map(
                        path -> MvcUriComponentsBuilder.fromMethodName(FileUploadController.class,
                                "serveFile", path.getFileName().toString()).build().toUri().toString())
                .collect(Collectors.toList()));

        return "uploadForm";*/

    }

    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> serveFiles(@PathVariable String filename) {
        Resource file = storageService.loadAsResource(filename);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }

    @GetMapping("/filecontent/{filename:.+}")
    @ResponseBody
    public ResponseEntity<String> serveFileContent(@PathVariable String filename) {
        Resource file = storageService.loadAsResource(filename);
        ReadableByteChannel readableByteChannel = null;
        try {
            readableByteChannel = file.readableChannel();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            try {
                if (readableByteChannel.read(byteBuffer) <= 0) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            stringBuffer.append(new String(byteBuffer.array()));
            byteBuffer.clear();
        }
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_TYPE, "application/json").body(stringBuffer.toString());
    }


    @PostMapping("/")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
        storageService.store(file);
        redirectAttributes.addFlashAttribute("message", "You successfully upload " + file.getOriginalFilename() + "!");
        return "redirect:/";
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }
}
