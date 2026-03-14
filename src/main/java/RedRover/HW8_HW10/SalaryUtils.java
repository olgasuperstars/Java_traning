package RedRover.HW8_HW10;
//Создать класс SalaryUtils, в котором будет статический метод calculateSalaryForOneMonth(Employee employee, Month month),
// который рассчитает зарплату для переданного сотрудника за указанный месяц.
//
//В том же классе создать статический метод calculateSalaryForManyMonths(Employee employee, Month[] months),
// который вычислит зарплату сотрудника за несколько месяцев.
public class SalaryUtils {
        static double calculateSalaryForOneMonth(Employee employee, Month month) {
        double salary = employee.daySalary * month.wokingDaysInMonth;
        return salary;
    }
   static double calculateSalaryForManyMonths(Employee employee, Month[] months) {
       double salaryForManyMonths = 0;
       for (int i = 0; i < months.length; i++ ) {
           salaryForManyMonths += calculateSalaryForOneMonth(employee, months[i]);

       }

       return salaryForManyMonths;
   }

   public static double getTotalSalary(Employee[] employees, Month[] months){
            double totalSalary = 0;
            for (int i = 0; i < employees.length; i++ ) {
                totalSalary += employees[i].getSalary(months);
            }
       return totalSalary;
    }

    public static void main(String[] args) {


    }
}
