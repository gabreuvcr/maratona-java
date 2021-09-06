package academy.devdojo.jiraya.javacore.exception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        System.out.println("Open connection: ");
        System.out.println(openConnection());
        System.out.println("\nOpen connection2: ");
        openConnection2();
    }

    private static String openConnection() {
        try {
            System.out.println("Opening file");
            System.out.println("Writing date to file");
            
            // if (true) throw new RuntimeException();
            return "Connection opened";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing file");
        }
        return null;
    }

    private static void openConnection2() {
        try {
            System.out.println("Opening file");
            System.out.println("Writing date to file");
            throw new RuntimeException();
        }  finally {
            System.out.println("Closing file");
        }
    }
}
