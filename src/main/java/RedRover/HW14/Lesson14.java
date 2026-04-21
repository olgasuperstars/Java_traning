package RedRover.HW14;
//White.
//Tan.
//Yellow.
//Orange.
//Red.
//Pink.
//Purple.
//Blue
import java.util.ArrayList;
import java.util.List;

public class Lesson14 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(List.of("White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"));

        System.out.println(list);
        System.out.println(findL(List.of("White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue")));

        List<String> list1 = new ArrayList<>(List.of("White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"));
        list1.removeIf(s -> s.toLowerCase().contains("l"));
        System.out.println(list1);

        List<String> list2 = new ArrayList<>(List.of("White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"));
        list2.removeIf(s -> (s.length() >= 4 || s.toLowerCase().contains("e")));
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();
        for (int i = 100; i < 1001; i++) {
            list3.add(i);
        }
//        list3.removeIf(i -> i % 2 == 0);
        list3.removeIf(i -> i % 3 != 0 || i % 5 != 0);

        System.out.println(list3);
        int sum = list3.stream()
                .mapToInt(i -> i) // превращаем в поток обычных чисел int
                .sum();           // считаем сумму

        System.out.println("Сумма: " + sum);
        double average = list3.stream()
                .mapToInt(i -> i)
                .average()      // считаем среднее
                .orElse(0);     // если список пустой, верни 0

        System.out.println("Среднее: " + average);

    }
    static List<String> findL(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (!s.contains("l")) {
                result.add(s);

            }
        }
        return result;
    }

}
