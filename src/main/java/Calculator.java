public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(checkEven(6));
        System.out.println(multiply(3,9));
        System.out.println(stringToUppercase("test"));
        System.out.println(isPositive(10000));
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static boolean checkEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String stringToUppercase(String input) {
        return input.toUpperCase();
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

}
