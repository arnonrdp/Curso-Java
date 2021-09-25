package devdojo.maratonajava.javacore.o.exception.runtime.test;

public class RuntimeException1 {
    public static void main(String[] args) {
        // NullPointerException
        Object object = new Object();
        object = null;
        System.out.println(object);

        // ArrayIndexOutOfBoundsException
        int[] nums = {1, 2};
        System.out.println(nums[4]);
    }
}
