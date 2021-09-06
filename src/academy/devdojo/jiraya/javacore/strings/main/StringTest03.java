package academy.devdojo.jiraya.javacore.strings.main;

public class StringTest03 {
    public static void main(String[] args) {
        long start, end;

        start = System.currentTimeMillis();
        concatString(30_000);
        end = System.currentTimeMillis();
        System.out.println("String: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start) + " ms");
    }

    private static void concatString(int length) {
        String text = "";
        for (int i = 0; i < length; i++) {
            text = text + i;
        }
    }

    private static void concatStringBuilder(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int length) {
        StringBuffer sb = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
    }
}
