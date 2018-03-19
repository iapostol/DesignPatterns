package structural.adapter;

import org.junit.Test;
import structural.adapter.translator.RomanianAdaptee;
import structural.adapter.translator.TranslatorAdapter;

public class TranslationAdapterTest {

    @Test
    public void testTranslation(){
        RomanianAdaptee adaptee = new RomanianAdaptee();
        TranslatorAdapter adapter = new TranslatorAdapter(adaptee);
        adapter.translate("some words in romanian");
    }

}
