package RedRover;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 2;

        System.out.println((a+b) + "; " + (a-b) + "; " + (a/b)  + "; " + (a*b) + "; " + (a%b));

        if (a%2 == 0) {
            System.out.println(a);
        }
        if (b%2 == 0) {
            System.out.println(b);
        }
        System.out.println("a = "+ a + "; b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("a = "+ a + "; b = " + b);


        int team = 35;
        int duoblon = 4000;
        int cash;
        cash = duoblon / 2;
        System.out.println("Владелец корабля получит " + cash + " дублонов");
        cash = (duoblon - cash) / 2;
        System.out.println("1 часть, которую получит Капитан " + cash + " дублонов");
        cash = ((duoblon - duoblon / 2) - cash) / (team + 1);
        System.out.println("Члены команды получат по " + cash + " дублонов");
        cash = cash + ((duoblon - (duoblon / 2)) / 2);
        System.out.println("Окончательный расчет Капитана после общего дележа " + cash + " дублонов");
        cash = (duoblon / 2) + cash;
        System.out.println("Джек Воробей получит " + cash + " дублонов");





    }
}
