package Codwares;
import java.util.List;
import java.util.ArrayList;

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
               .collect(Collectors.toList());


    }
    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++ ) {
            sum += i;

}
        return sum;
    }
}
