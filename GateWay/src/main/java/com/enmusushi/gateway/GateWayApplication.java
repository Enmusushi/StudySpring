package com.enmusushi.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@SpringBootApplication
@RestController
@EnableConfigurationProperties(GateWayApplication.UriConfiguration.class)
public class GateWayApplication {
    private static final Logger logger = LoggerFactory.getLogger(GateWayApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder, UriConfiguration uriConfiguration) {
        String httpUri = uriConfiguration.getHttpBin();
        logger.info(httpUri);
        return builder.routes().route(
                p -> p.path("/get")
                        .filters(
                                f -> f.addRequestHeader("Hello", "World")
                        ).uri(httpUri)
        ).route(
                p -> p.host("*.circuitbreaker.com").filters(
                        f -> f.circuitBreaker(
                                config -> config.setName("mycmd").setFallbackUri("forward:/fallback")
                        )
                ).uri(httpUri)
        ).build();
    }

    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }

    @ConfigurationProperties(value = "uri")
    class UriConfiguration {
        private String httpBin = "http://httpbin.org:80";

        public String getHttpBin() {
            return httpBin;
        }

        public void setHttpBin(String httpBin) {
            this.httpBin = httpBin;
        }
    }
}
