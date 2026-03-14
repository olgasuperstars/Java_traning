package RedRover.HW8_HW10;

public class Director extends Manager {
    public Director(String name, int daySalary, int numbersOfEmployees) {
        super(name, daySalary, numbersOfEmployees);
    }

    @Override
    public double getSalary (Month[] monthArray){
        double totalSalary = 0;
        double bonusMultiplier = 1 + (super.numbersOfEmployees * 0.03);
        for (int i = 0; i < monthArray.length; i++){
            totalSalary += monthArray[i].daysInMonth * super.daySalary * bonusMultiplier;
        }
        return totalSalary;
    }
}
