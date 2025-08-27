package com.fourinrow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

/**
 * Aplicación principal del juego 4 en línea - Versión 2.0
 * Incluye WebSocket support y caching para mejor rendimiento
 */
@SpringBootApplication
@EnableWebSocket
@EnableCaching
public class FourInRowApplication {

    public static void main(String[] args) {
        SpringApplication.run(FourInRowApplication.class, args);
    }
}
