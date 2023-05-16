package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) ? 1 : 0) {
            case (1):
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
                break;
        }
    }
}
