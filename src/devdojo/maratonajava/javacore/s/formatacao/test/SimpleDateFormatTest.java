package devdojo.maratonajava.javacore.s.formatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
