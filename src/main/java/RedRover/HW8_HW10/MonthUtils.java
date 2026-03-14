package RedRover.HW8_HW10;
//    Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).

public class MonthUtils {
    static Month january = new Month("January", 31, 21);
    static Month february = new Month("February", 28, 31);
    static Month march = new Month("March", 31, 22);
    static Month april = new Month("April", 30, 21);
    static Month may = new Month("May", 31, 22);
    static Month june = new Month("June", 30, 21);
    static Month july = new Month("July", 31, 22);
    static Month august = new Month("August", 31, 23);
    static Month september = new Month("September",  30, 21);
    static Month october = new Month("October",31,22);
    static Month november = new Month("November",30,20);
    static Month december = new Month("December",31,20);
    static Month[] months = {january, february, march, april, may, june, july, august, september, october, november, december};
static {
    january.nameOfMonth = "January";
    january.daysInMonth = 31;
    january.wokingDaysInMonth = 21;

    february.nameOfMonth = "February";
    february.daysInMonth = 28;
    february.wokingDaysInMonth = 19;

    march.nameOfMonth = "March";
    march.daysInMonth = 31;
    march.wokingDaysInMonth = 22;

    april.nameOfMonth = "April";
    april.daysInMonth = 30;
    april.wokingDaysInMonth = 21;

    may.nameOfMonth = "May";
    may.daysInMonth = 31;
    may.wokingDaysInMonth = 22;

    june.nameOfMonth = "June";
    june.daysInMonth = 30;
    june.wokingDaysInMonth = 21;

    july.nameOfMonth = "July";
    july.daysInMonth = 31;
    july.wokingDaysInMonth = 22;

    august.nameOfMonth = "August";
    august.daysInMonth = 31;
    august.wokingDaysInMonth = 23;

    september.nameOfMonth = "September";
    september.daysInMonth = 30;
    september.wokingDaysInMonth = 21;

    october.nameOfMonth = "October";
    october.daysInMonth = 31;
    october.wokingDaysInMonth = 22;

    november.nameOfMonth = "November";
    november.daysInMonth = 30;
    november.wokingDaysInMonth = 20;

    december.nameOfMonth = "December";
    december.daysInMonth = 31;
    december.wokingDaysInMonth = 20;



}
}
