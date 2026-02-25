package RedRover.HW8;
//Создать класс SalaryUtils, в котором будет статический метод calculateSalaryForOneMonth(Employee employee, Month month),
// который рассчитает зарплату для переданного сотрудника за указанный месяц.
//
//В том же классе создать статический метод calculateSalaryForManyMonths(Employee employee, Month[] months),
// который вычислит зарплату сотрудника за несколько месяцев.
public class SalaryUtils {
    static int calculateSalaryForOneMonth(Employee employee, Month month) {
        int salary = employee.daySalary * month.wokingDaysInMonth;
        return salary;
    }
   static int calculateSalaryForManyMonths(Employee employee, Month[] months) {
       int salaryForManyMonths = 0;
       for (int i = 0; i < months.length; i++ ) {
           salaryForManyMonths += calculateSalaryForOneMonth(employee, months[i]);

       }

       return salaryForManyMonths;
   }
}
