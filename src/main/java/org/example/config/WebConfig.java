package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Tüm API endpoint'lerine izin verir
                .allowedOrigins("http://localhost:5177") // Frontend'in çalıştığı port (yeniden kontrol edin)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Tüm metodlara izin verir, OPTIONS preflight isteği için gereklidir
                .allowedHeaders("*") // Tüm başlıklara izin verir
                .allowCredentials(true); // Kimlik doğrulama için izin verir
    }
}
