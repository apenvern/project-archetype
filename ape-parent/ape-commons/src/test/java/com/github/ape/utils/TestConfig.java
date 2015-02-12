package com.github.ape.utils;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("unit-test")
@Configuration
@ComponentScan({ "com.github.ape" })
@EnableAutoConfiguration
public class TestConfig {

}