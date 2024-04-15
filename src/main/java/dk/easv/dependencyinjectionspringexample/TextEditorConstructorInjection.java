package dk.easv.dependencyinjectionspringexample;

public class TextEditorConstructorInjection
{
    private final SpellChecker spellChecker;

    public TextEditorConstructorInjection(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void proofreadDocument() {
        spellChecker.checkSpelling();
        System.out.println("Proofreading document...");
    }
}
