package RedRover.HW8_HW10;

//    Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.

public class Month {
    String nameOfMonth;
    int daysInMonth;
    int wokingDaysInMonth;

    public Month(String nameOfMonth, int daysInMonth, int wokingDaysInMonth) {
        this.nameOfMonth = nameOfMonth;
        this.daysInMonth = daysInMonth;
        this.wokingDaysInMonth = wokingDaysInMonth;
    }
}
