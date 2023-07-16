package CURSO_VIDEO.JAVA;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("Seu sistema está em " + idioma.getDisplayLanguage());
    }
}
