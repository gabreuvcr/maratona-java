package academy.devdojo.jiraya.javacore.exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(division(1, 0));
    }

    /**
     * 
     * @param a
     * @param b Value cannot be 0
     * @return
     * @throws IllegalArgumentException if b is 0
     */
    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        
        return a / b;
    }
}
