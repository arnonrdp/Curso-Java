package devdojo.maratonajava.javacore.s.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatTest {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localePT);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 10_000_2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
