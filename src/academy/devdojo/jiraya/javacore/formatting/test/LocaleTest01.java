package academy.devdojo.jiraya.javacore.formatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
        public static void main(String[] args) {
            Locale localeItaly = new Locale("it", "IT");
            Locale localeSwitzerland = new Locale("it", "CH");
            Locale localeIndia = new Locale("hi", "IN");
            Locale localeJapan = new Locale("ja", "JP");
            Locale localeNetherlands = new Locale("nl", "NL");
            
            Calendar calendar = Calendar.getInstance();
            
            DateFormat dfItaly = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
            DateFormat dfSwitzerland = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
            DateFormat dfIndia = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
            DateFormat dfJapan = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
            DateFormat dfNetherlands = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);

            System.out.println("Italy: " + dfItaly.format(calendar.getTime()));
            System.out.println("Switzerland: " + dfSwitzerland.format(calendar.getTime()));
            System.out.println("India: " + dfIndia.format(calendar.getTime()));
            System.out.println("Japan: " + dfJapan.format(calendar.getTime()));
            System.out.println("Netherlands: " + dfNetherlands.format(calendar.getTime()));

            System.out.println(localeItaly.getDisplayCountry(localeJapan));
            System.out.println(localeItaly.getDisplayLanguage(localeJapan));
            System.out.println(localeNetherlands.getDisplayCountry(localeJapan));
            System.out.println(localeNetherlands.getDisplayLanguage(localeJapan));
        }
    }
    