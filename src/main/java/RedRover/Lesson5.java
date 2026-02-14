package RedRover;

import java.util.Arrays;

public class Lesson5 {
//    Задача №1
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести все нечетные числа из массива.
//Задача №2
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести все значения массива больше 5.
//Задача №3
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо увеличить все значения массива на 15.

    public static void main(String[] args) {
//#1
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i <= (array.length - 1); i++ ) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }

        }
//#2
        for (int i = 0; i <= (array.length - 1); i++ ) {
            if (array[i] > 5) {
                System.out.println(array[i]);
            }
        }

//#3
        for (int i = 0; i <= (array.length - 1); i++ ) {
            array[i] += 15;

        }
        System.out.println(Arrays.toString(array));
    }


}
