package academy.devdojo.jiraya.javacore.formatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[4];

        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR); 
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double value = 1_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(value));
        }

        String valueString = "￥1,000";
        try {
            System.out.println(nfa[2].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        } 
    }
}
