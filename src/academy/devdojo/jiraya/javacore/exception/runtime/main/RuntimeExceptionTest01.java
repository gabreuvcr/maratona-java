package academy.devdojo.jiraya.javacore.exception.runtime.main;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked & Unchecked
        // Object object;
        // System.out.println(object.toString());
        // NullPointerException

        int[] nums = new int[] {1, 2};
        System.out.println(nums[2]);
    }
}
