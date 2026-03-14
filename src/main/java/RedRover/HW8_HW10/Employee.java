package RedRover.HW8_HW10;
//Создать класс Employee с полями: имя, возраст, пол и ЗП в день.
public class Employee {
    protected final String name;
    protected final double daySalary;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Employee(String name, int daySalary) {
        this.name = name;
        this.daySalary = daySalary;
    }
    public double  getSalary(Month[] monthArray){
        double totalSalary = 0;
        for (int i = 0; i < monthArray.length; i++) {

            totalSalary += monthArray[i].daysInMonth * this.daySalary;
        }
        return totalSalary;
    }
}
