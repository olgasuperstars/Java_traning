package RedRover.HW7;
//Необходимо написать 4 метода:
//сложение 2х чисел
//вычитание 2х чисел
//умножение 2х чисел
//деление 2х чисел

public class Lesson7 {
public static int multiply(int a, int b){
    return a*b;
}
public static int add(int a, int b){
    return a+b;
}
public static int subtract(int a, int b){
    return a-b;
}
public static double devide(double a, double b){
    return a/b;
}

public static void main(String[] args) {
    System.out.println(multiply(2,3));
    System.out.println(add(1,2));
    System.out.println(subtract(1,2));
    System.out.println(devide(2,3));


}
// Тимми и Сара думают, что влюблены, но в их местности они узнают об этом только после того, как сорвут по одному цветку.
// Если у одного цветка четное количество лепестков, а у другого — нечетное, это значит, что они влюблены.
//Напишите функцию, которая будет принимать количество лепестков каждого цветка и возвращать true, если они влюблены, и false, если нет.

    public static boolean isLove(final int flower1, final int flower2) {
        return ((flower1+flower2)%2 != 0 ? true : false);
    }
//    Нам нужна функция, которая может преобразовывать число (целое число) в строку.
    public static String numberToString(int num) {

        return "" + num; // Return a string of the number here!
    }
//    Дана последовательность целых чисел. Ваше решение должно найти наименьшее целое число.
    public static int findSmallestInt(int[] args) {
    int smallest = args[0];
    for (int i = 1; i < args.length; i++) {
        if (args[i] < smallest) {
            smallest = args[i];
        }
    }
        return smallest;
    }
//    Если задано неотрицательное целое число, 3 например, верните строку с шепотом: "1 sheep...2 sheep...3 sheep...".
//    Входные данные всегда будут допустимыми, то есть не будут содержать отрицательных целых чисел.
    public static String countingSheep(int num) {
        String result = "";

    for (int i = 1; i < num +1; i++) {
        result += i + " sheep...";

        }
        return result;
    }
}
