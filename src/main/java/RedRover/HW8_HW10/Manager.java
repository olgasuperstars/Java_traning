package RedRover.HW8_HW10;

public class Manager extends Employee {
    protected int numbersOfEmployees;
    public Manager(String name, int daySalary, int numbersOfEmployees) {
        super(name, daySalary);
        this.numbersOfEmployees = numbersOfEmployees;
    }

    @Override
    public double getSalary (Month[] monthArray){
        double totalSalary = 0;
        double bonusMultiplier = 1 + (this.numbersOfEmployees * 0.01);
        for (int i = 0; i < monthArray.length; i++){
            totalSalary += monthArray[i].daysInMonth*super.daySalary*bonusMultiplier;
        }
        return totalSalary;
    }
}
