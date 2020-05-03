package com.coden2020.hackaton.app.application;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.coden2020.hackaton.app.infrastructure.repository")
public class JpaConfig {
}