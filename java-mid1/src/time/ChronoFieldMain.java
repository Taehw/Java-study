package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {

    public static void main(String[] args) {

        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println(value + ", range = " + value.range());
        }

        System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range()); // 1 - 12
        System.out.println("DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range()); //1 - 28/31
    }
}