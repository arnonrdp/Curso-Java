package devdojo.maratonajava.javacore.s.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest1 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSuica = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Itália " + df1.format(calendar.getTime()));
        System.out.println("Suiça " + df2.format(calendar.getTime()));
        System.out.println("India " + df3.format(calendar.getTime()));
        System.out.println("Japao " + df4.format(calendar.getTime()));
        System.out.println("Holanda " + df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry()); // Itália
        System.out.println(localeSuica.getDisplayCountry()); // Suiça
        System.out.println(localeIndia.getDisplayCountry()); // Índia
        System.out.println(localeJapao.getDisplayCountry()); // Japão
        System.out.println(localeHolanda.getDisplayCountry()); // Países Baixos
    }
}
