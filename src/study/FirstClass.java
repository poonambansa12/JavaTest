package study;

import java.util.Random;
import java.time.*;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println(args[0] + "," + args[1]);
        Random r = new Random();
        int n = -11%-3;
        System.out.println(r.nextInt(100));
        System.out.println(n);
        String string = "animals";
        System.out.println(string.substring(3));  // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7));
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");                   // sb = animals-
        sb.insert(0, "-");                   // sb = -animals-
        sb.insert(4, "-");                   // sb = -ani-mals-
        System.out.println(sb);
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        date = date.plusDays(9);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date.plusDays(1));
        System.out.println(date.minusDays(1));
        Period wrong = Period.ofYears(1);
        wrong = Period.ofWeeks(1);
        System.out.println(wrong);
        LocalDate date1 = LocalDate.of(2020, Month.FEBRUARY, 20);
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfYear());
    }
}
