package com.example.spring5jokesappv2.config;

import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigChuckNoris {

    @Bean
    public ChuckNorrisInfoContributor chuckNorrisInfoContributor() {
        return new ChuckNorrisInfoContributor();
    }
}
