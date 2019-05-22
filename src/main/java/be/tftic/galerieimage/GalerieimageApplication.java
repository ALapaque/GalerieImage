package be.tftic.galerieimage;


import be.tftic.galerieimage.property.ImageStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableConfigurationProperties({
        ImageStorageProperties.class
})
@EntityScan(basePackageClasses = {
        GalerieimageApplication.class,
        Jsr310JpaConverters.class
})
public class GalerieimageApplication {

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) {
        SpringApplication.run(GalerieimageApplication.class, args);
    }

}
