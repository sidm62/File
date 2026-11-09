package Adap;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        NewDateInterface date = new CalendarToNewDateAdapter(calendar);

        date.setYear(2024);
        date.setMonth(6);
        date.setDay(7);

        System.out.println("Current Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
        date.advanceDay(365);
        System.out.println("Date after advancing 5 days: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    }


}
