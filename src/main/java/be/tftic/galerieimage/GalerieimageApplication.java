package be.tftic.galerieimage;

import be.tftic.galerieimage.property.ImageStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableConfigurationProperties({
        ImageStorageProperties.class
})
public class GalerieimageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GalerieimageApplication.class, args);
    }

}
