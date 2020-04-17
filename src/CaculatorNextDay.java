public class CaculatorNextDay {
    public static String nextDay(int aDay, int aMonth, int year) {
        int caculatorDay;
        int caculatorMonth;
        int caculatorYear;
        String result;

        boolean isEndMonth = aDay == caculatorDayOfMonth(aMonth, year);
        boolean isEndYear = aMonth == 12;

        if (isEndYear) {
            caculatorDay = 1;
            caculatorMonth = 1;
            caculatorYear = year + 1;
        }
        else if(isEndMonth){
            caculatorDay = 1;
            caculatorMonth = aMonth + 1;
            caculatorYear = year;
        }
        else {
            caculatorDay = aDay + 1;
            caculatorMonth = aMonth;
            caculatorYear = year;
        }

        result = "Ngày " + caculatorDay + " tháng " + caculatorMonth + " năm " + caculatorYear;
        return result;
    }

    public static int caculatorDayOfMonth(int aMonth, int year) {
        switch (aMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return caculatorFebruary(year);
            default:
                return 0;
        }
    }

    public static int caculatorFebruary(int year) {
        int day;
        boolean isDivision4 = year % 4 == 0;
        boolean isDivision100 = year % 100 == 0;
        boolean isDivision400 = year % 400 == 0;
        boolean isLeapYear = false;

        if (isDivision4) {
            if (isDivision100) {
                if (isDivision400) {
                    isLeapYear = true;
                }
            }
            else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            day = 29;
        } else {
            day = 28;
        }
        return day;
    }
}
