package Codwares;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Olga_trening1 {

    public void main(String[] args) {
        System.out.println(friend(Arrays.asList("Ryan", "Kieran", "Jason", "Yous")));

    }

    public static List<String> friend(List<String> x){
        List<String> frd = new ArrayList<>();
        for (String name : x) {
            if (name.length()==3) {
                frd.add(name);

            }
        }

        return frd;
    }





}
