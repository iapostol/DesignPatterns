package structural.adapter.translator;

public class TranslatorAdapter implements JapaneseTarget {

    private RomanianAdaptee adaptee;

    public TranslatorAdapter(RomanianAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void translate(String words) {

        adaptee.performInstructions(words);
    }
}
