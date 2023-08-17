package l_DateTime.partThree;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test {

    public static void main(String[] args) {
        dateTimeDateTime();
    }

    private static void dateTimeDateTime(){
        System.out.println("------------------ dateTimeDateTime ----------------------");

        LocalDate date = LocalDate.of(2023, Month.MARCH, 23);
        System.out.println( date ); // 2023-03-23

        LocalDate date1 = date.plusDays(20);
        System.out.println( date1 ); // 2023-04-12

        LocalTime time = LocalTime.of(11,12,13);
        System.out.println( time ); // 11:12:13

        LocalTime time1 = time.plusHours(14);
        System.out.println(time1); // 01:12:13

        LocalDateTime dateTime = LocalDateTime.of(2023,Month.MARCH,23,11,12,13);
        System.out.println( dateTime ); // 2023-03-23T11:12:13

        LocalDateTime dateTime1 = dateTime.plusMonths(23);
        System.out.println( dateTime1 ); // 2025-02-23T11:12:13

        LocalDate date2 = LocalDate.from(dateTime1); // dateTime has date component
        System.out.println( date2 );

        LocalTime time2 = LocalTime.from(dateTime1); // dateTime has time component
        System.out.println( time2 );

    }

}
