package Codwares;
import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.stream.Collectors;

public class NewTraining {
    public static boolean solution(String str, String ending) {
if (str.endsWith(ending)) {
    return true;
}
        return false;
    }

    public static boolean  isIsogram(String str) {
       str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) { // Палец стоит на текущей букве
            for (int j = i + 1; j < str.length(); j++) { // Пробегаем по буквам справа от него
               if (str.charAt(i) == str.charAt(j)) {
               return false;
               }
            }

            }
        return  true;
        }
    public static String bmi(double weight, double height) {
double bmi = weight / (height * height);
if (bmi <= 18.5) {
    return "Underweight";
}
else if (bmi <= 25) {
    return "Normal";
}
else if (bmi <= 30) {
    return "Overweight";
}
else {
    return "Obese";}

    }
    public static int century(int number) {
        int century = (int) Math.ceil(number / 100.0);
        return century;
    }
    public static List<Object> filterList(final List<Object> list) {
       return list.stream()
               .filter(item -> item instanceof Integer)
               .toList();


    }
    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++ ) {
            sum += i;

}
        return sum;
    }
    public static Map<Character, Integer> count(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.summingInt(c -> 1)));

    }
    public static int[] moveZerosToStart(int[] arr) {
        int[] result = new int[arr.length];
        int index = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index--;
            }
        }

        return result;
    }
}
