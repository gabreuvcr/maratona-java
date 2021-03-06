package academy.devdojo.jiraya.javacore.formatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[4];

        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR); 
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double value = 1_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(value));
        }

        String valueString = String.valueOf(value);
        String valueString2 = "1_000.2130";
        try {
            System.out.println(nfa[0].parse(valueString));
            System.out.println(nfa[0].parse(valueString2));
        } catch (ParseException e) {
            e.printStackTrace();
        } 
    }
}
