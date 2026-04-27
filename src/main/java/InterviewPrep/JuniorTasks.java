package InterviewPrep;

import java.util.Arrays;

public class JuniorTasks {
    public static void main(String[] args) {
        String test = "А роза упала на лапу Азора";
        System.out.println(test + " - Это полиндром? - " + isPalindrom(test));
        System.out.println(reverse(test));
        System.out.println(isPalindrom2(test));
        String[] input = {"яблоко", "банан", "яблоко", "апельсин", "банан"};
        String[] result = removeDuplicates(input);
        System.out.println(Arrays.toString(result));
        System.out.println(countWords(test));

    }

    //    палиндром
    public static boolean isPalindrom(String text) {
        if (text.length() == 0 || text.length() == 1) {
            return false;
        }
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        String reversedText = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversedText);

    }
// вариант с циклом
    public static boolean isPalindrom2(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        if (text.length() <= 1) {
            return false;
        }
        for (int i = 0; i < text.length()/2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        } return  true;
    }

//    развернуть строку
        public static String reverse (String str){
            String reversedStr = new StringBuilder(str).reverse().toString();
            return reversedStr;

        }
//    вариант с циклом
public static String reverse2(String s){
    String result  = "";
    for (int i = s.length()-1; i >= 0; i--) {
        result += s.charAt(i);
    }
    return result;
}

public static String[] removeDuplicates(String[] words){
        return Arrays.stream(words)
                .distinct()
                .toArray(String[]::new);
    }
    public static Integer countWords(String str){
        if (str == null || str.trim().isEmpty()) return 0;

        return str.trim().split("\\s+").length;
    }
}
