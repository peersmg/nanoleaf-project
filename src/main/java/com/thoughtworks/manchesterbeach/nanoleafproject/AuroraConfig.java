package com.thoughtworks.manchesterbeach.nanoleafproject;

import io.github.rowak.nanoleafapi.Aurora;
import io.github.rowak.nanoleafapi.AuroraMetadata;
import io.github.rowak.nanoleafapi.StatusCodeException;
import io.github.rowak.nanoleafapi.tools.Setup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.List;

@Configuration
public class AuroraConfig {
    private String apiLevel = "v1";
    private int port = 16021;
    private String host = "192.168.43.43";
    private String accessToken = "KrFX6dXZw4GFoiEkb1DmKO9KZJAgycFV";

    @Bean
    public Aurora getAuroraObject() throws IOException, StatusCodeException {
//        int timeout = 5000;
//        List<AuroraMetadata> auroras = Setup.findAuroras(timeout);
//        String host = auroras.get(0).getHostName();
//        int port = auroras.get(0).getPort();
        //String accessToken = Setup.createAccessToken(host, port, apiLevel);
        return new Aurora(host, port, apiLevel, accessToken);
    }
}
