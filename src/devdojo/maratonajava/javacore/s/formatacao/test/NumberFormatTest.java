package devdojo.maratonajava.javacore.s.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localePT);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 1_000_2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
