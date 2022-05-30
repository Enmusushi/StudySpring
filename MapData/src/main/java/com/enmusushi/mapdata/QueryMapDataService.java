package com.enmusushi.mapdata;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Admin
 */
public class QueryMapDataService {

    public String queryDataFromURL(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("accept", "*/*");
        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setDoOutput(false);
        conn.setDoInput(true);
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuffer buffer = new StringBuffer();
        String line;
        while ((line = in.readLine()) != null) {
            buffer.append(line);
        }
        in.close();
        conn.disconnect();
        return buffer.toString();
    }

    public void geoJson2File(String fileName, String fileContent) throws IOException {
        File file = new File(fileName);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists() && file.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(fileContent);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        }
    }

    public String saveFileFromURL(String url, String filePath) {
        String fileContent = null;
        try {
            fileContent = queryDataFromURL(url);
            int startIndex = url.lastIndexOf("code=");
            int endIndex = url.lastIndexOf("_full");
            String fileName = url.substring(startIndex + 5, endIndex == -1 ? url.length() : endIndex) + ".json";
            geoJson2File(filePath + "//" + fileName, fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    public void analysisGeoJson(String content, String urlStr, String filePath) throws JSONException {
        JSONObject jsonObject = new JSONObject(content);
        JSONArray features = jsonObject.getJSONArray("features");
        for (int i = 0; i < features.length(); i++) {
            JSONObject feature = features.getJSONObject(i);
            JSONObject properties = feature.getJSONObject("properties");
            String adCode = properties.getString("adcode");
            String level;
            try {
                level = properties.getString("level");
            } catch (Exception e) {
                System.out.println(adCode);
                continue;
            }

            if (level != null && "province".equals(level) && !"710000".equals(adCode)) {
                adCode += "_full";
            }
            String url = urlStr + adCode;
            String fileContent = saveFileFromURL(url, filePath);
            jsonObject = new JSONObject(fileContent);
            JSONArray provinceFeatures = jsonObject.getJSONArray("features");
            for (int j = 0; j < provinceFeatures.length(); j++) {
                properties = feature.getJSONObject("properties");
                adCode = properties.getString("adcode");
                level = null;
                try {
                    level = properties.getString("level");
                } catch (Exception e) {
                    System.out.println(adCode);
                }
                if (level != null && "province".equals(level) && !"710000".equals(adCode)) {
                    adCode += "_full";
                }
                url = urlStr + adCode;
                saveFileFromURL(url, filePath);
            }

        }
        /*for (JSONObject object : jsonArray.) {

        }
*/
        System.out.println(filePath);

    }


    // public

}
