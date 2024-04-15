package dk.easv.dependencyinjectionspringexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInjectionSpringExampleApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DependencyInjectionSpringExampleApplication.class, args);

        // Creating instances of SpellChecker
        //SpellChecker spellChecker = new SpellChecker();

        // Constructor Injection
        //TextEditorConstructorInjection textEditorConstructorInjection = new TextEditorConstructorInjection(spellChecker);
        //textEditorConstructorInjection.proofreadDocument();

        // Setter Injection
        //TextEditorSetterInjection textEditorSetterInjection = new TextEditorSetterInjection();
        //textEditorSetterInjection.setSpellChecker(spellChecker);
        //textEditorSetterInjection.proofreadDocument();

        // Field Injection
        ApplicationContext context = new AnnotationConfigApplicationContext("dk.easv.dependencyinjectionspringexample");
        TextEditorFieldInjection textEditorFieldInjection = context.getBean(TextEditorFieldInjection.class);
        textEditorFieldInjection.proofreadDocument();
    }

}
