package com.maila.betterreads.betterreads;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.File;

@ConfigurationProperties(prefix = "datastax.astra")
public class DataStaxAstraProperties {
    @Getter
    @Setter
    private File secureConnectBundle;
}
