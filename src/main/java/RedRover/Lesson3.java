package RedRover;

public class Lesson3 {
    public static void main(String[] args) {
        int a = 40;
        int b = 21;
        if (a > b) {
            System.out.println(a + " > " + b + " значит a > b");
        }
        if (a < b) {
            System.out.println(a + " < " + b + " значит a < b");
        }
        if (a == b) {
            System.out.println(a + " == " + b + " значит a == b");
        }
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        }
        if ((a + b) % 2 != 0) {
            System.out.println("some variable is odd");

        }
        if (a > 10) {
            System.out.println(a + " is greater than 10");
        }
        if (a < 100) {
            System.out.println(a + " is less than 100");

        }
        if ((a / 2) > 20) {
            System.out.println(a + " - the result of dividing by 2 is greater than 20");

        }
        if ((a < 5) || (a > 40)) {
            System.out.println(a + " - значение переменной меньше 5 или больше 40");

        }
        if ((a >= 5) && (a <= 40)) {
            System.out.println(a + " - значение переменной между 5 и 40 включительно");

        }
    }

}
