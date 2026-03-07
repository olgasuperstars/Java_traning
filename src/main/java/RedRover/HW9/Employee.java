package RedRover.HW9;

public class Employee extends Person {
    private double salary;

    public boolean  isSameName(Employee employee) {
        return this.getName().equals(employee.getName());
    }
}
