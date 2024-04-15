package dk.easv.dependencyinjectionspringexample;

public class TextEditorSetterInjection
{
    private SpellChecker spellChecker;

    public void setSpellChecker(SpellChecker spellChecker)
    {
        this.spellChecker = spellChecker;
    }

    public void proofreadDocument()
    {
        spellChecker.checkSpelling();
        System.out.println("Proofreading document...");
    }
}
