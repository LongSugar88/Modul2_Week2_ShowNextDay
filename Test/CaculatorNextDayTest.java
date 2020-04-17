import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CaculatorNextDayTest {

    @Test
    void nextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expect = "Ngày 2 tháng 1 năm 2018";

        String result = CaculatorNextDay.nextDay(day, month, year);
        assertEquals(expect, result);
    }

    @Test
    void nextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expect = "Ngày 1 tháng 2 năm 2018";

        String result = CaculatorNextDay.nextDay(day, month, year);
        assertEquals(expect, result);
    }

    @Test
    void nextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expect = "Ngày 1 tháng 5 năm 2018";

        String result = CaculatorNextDay.nextDay(day, month, year);
        assertEquals(expect, result);
    }

    @Test
    void nextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expect = "Ngày 1 tháng 3 năm 2018";

        String result = CaculatorNextDay.nextDay(day, month, year);
        assertEquals(expect, result);
    }

    @Test
    void nextDay5() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expect = "Ngày 1 tháng 3 năm 2018";

        String result = CaculatorNextDay.nextDay(day, month, year);
        assertEquals(expect, result);
    }

    @Test
    void nextDay6() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expect = "Ngày 1 tháng 3 năm 2020";

        String result = CaculatorNextDay.nextDay(day, month, year);
        assertEquals(expect, result);
    }

    @Test
    void nextDay7() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expect = "Ngày 1 tháng 1 năm 2019";

        String result = CaculatorNextDay.nextDay(day, month, year);
        assertEquals(expect, result);
    }
}