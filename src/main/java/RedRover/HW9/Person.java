package RedRover.HW9;

public class Person {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        if (gender == "М"){
            return "Mr." + name;
        }
        else {
        return "Ms." + name;
        }

    }
}
