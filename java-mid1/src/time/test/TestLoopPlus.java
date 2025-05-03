package time.test;

import java.time.LocalDate;

public class TestLoopPlus {

    public static void main(String[] args) {

        LocalDate dt = LocalDate.of(2024, 1, 1);
        int i = 0;
        do {
            System.out.println("날짜 " + (i + 1) + ": " + dt.plusWeeks(i*2));
            i++;
        } while (i < 5);

    }
}
