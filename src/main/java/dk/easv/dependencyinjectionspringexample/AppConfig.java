package dk.easv.dependencyinjectionspringexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "dk.easv.dependencyinjectionspringexample")
public class AppConfig
{
    // Configuration class to enable component scanning
    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }
}