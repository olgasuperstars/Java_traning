package RedRover.HW11;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.ls.LSOutput;

public class MyString {
    public static String shortenString(String text, int length) {
        // Используем библиотечный метод abbreviate
        return StringUtils.abbreviate(text, length);
    }

    public static void main(String[] args) {
        System.out.println(shortenString("Привет всем кто живет на луне!", 10));
        System.out.println(shortenString("Привет всем кто живет на луне!", 20));
    }

}
