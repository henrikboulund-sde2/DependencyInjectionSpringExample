package dk.easv.dependencyinjectionspringexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditorFieldInjection
{
    @Autowired
    private SpellChecker spellChecker;

    public void proofreadDocument()
    {
        spellChecker.checkSpelling();
        System.out.println("Proofreading document...");
    }
}
