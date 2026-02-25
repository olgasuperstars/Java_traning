package RedRover.HW6;

import java.util.Arrays;

public class Lesson6 {

    public static void main(String[] args) {
//        Задача №4
//Дана строка:
//String s = “Перестановочный алгоритм быстрого действия”;
//необходимо вывести все буквы “о” из этой строки.
//Для указанной строки ответ будет “ооооо” (или в столбик)
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i <= s.length()-1; i++) {
            if (s.charAt(i) == 'о') {
                System.out.println(s.charAt(i));
            }
        }

//Задача №5
//Дана строка:
//String s = “Перевыборы выбранного президента”;
//необходимо подсчитать количество букв “е” в строке.
//Для указанной строки ответ будет 4.
        s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i <= s.length()-1; i++) {
            if (s.charAt(i) == 'е') {
                count++;

            }

        }
        System.out.println(count);
//Задача №6
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести сумму всех значений массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
//Задача №7
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести сумму элементов массива.
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] arr1 = arr[i];
            for (int j = 0; j < arr1.length; j++) {
                sum2 += arr1[j];
            }
        }
        System.out.println(sum2);
//Задача №8
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести максимальное значение массива.
        int max = arr[0][0];
        //  Внешний цикл по строкам
        for (int i = 0; i < arr.length; i++) {
            // Внутренний цикл по элементам конкретной строки
            for (int j = 0; j < arr[i].length; j++) {
                // Сравнение
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
//Задача №9
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести количество элементов в массиве.
int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count1++;
            }
        }
        System.out.println(count1);

//Задача №10 (со звездочкой)
//Даны температуры воздуха за несколько дней:
//int[] temps = {18, 20, 17, 19, 16, 15, 21};
//Необходимо посчитать сколько раз за эти дни температура падала в сравнении с предыдущим днем.
        int[] temps = {18, 20, 17, 19, 16, 15, 21};
        int count2 = 0;
        for (int i = 0; i < temps.length-1; i++) {
            if (temps[i+1] < temps[i]) {
                count2++;

            }
        }
        System.out.println(count2);
//Задача №11 (со звездочкой)
//Дан массив:
//int[] arr = {1, 2, 3, 4, 5};
//Необходимо “сдвинуть” этот массив влево на одну позицию так, чтобы получилось:
//{2, 3, 4, 5, 1}
        int[] arr3 = {1, 2, 3, 4, 5};
        int first = arr3[0];
        for (int i = 0; i < arr3.length-1; i++) {
            arr3[i] = arr3[i+1];

        }
        arr3[arr3.length-1] = first;
        System.out.println(Arrays.toString(arr3));
    }
}
