public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        try {
            int j = i / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            // Removed the return statement; execution continues
        }
        System.out.println("This line will now be executed even if an exception occurs");
    }
}