package coreJavaVolume01.ch03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 输出当前日期的的一个月日历
 * 以星期日开头
 *
 * @author Huxzhi
 * @date 2019/10/29
 */
public class Calendar01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy MM dd E");
        String[] text = sm.format(c.getTime()).split("\\s+");
        printMonth(Integer.parseInt(text[0]), Integer.parseInt(text[1]), Integer.parseInt(text[2]));
    }

    public static void printMonth(int year, int month, int day) {
        printMonthTitle(year, month);
        printMonthBody(year, month, day);
    }

    private static void printMonthBody(int year, int month, int day) {
        int startDay = getStartDay(year, month);
        //System.out.println("startDay = " + startDay);
        int numberOfDaysInMonth = getNumberOfDaysInMonths(year, month);
        //System.out.println("numberOfDaysInMonth = " + numberOfDaysInMonth);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
            //这里空格数是4，不对的话第一行位置会偏
        }
        for (int i = 1; i < numberOfDaysInMonth + 1; i++) {
            //i=0,则日期从0开始,numberOfDaysInMonth + 1不加1则少一天
            if (i == day) {
                System.out.printf("%2d", i);
            }else {
                System.out.printf("%4d", i);
            }

            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }


    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 4;
        //原 3 时间慢了一天
        int totalNumberOfDay = getTotalNumberOfDays(year, month);

        return (totalNumberOfDay + START_DAY_FOR_JAN_1_1800) % 7;
    }


    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        for (int i = 0; i < 1800; i++) {
            if (isLeapYear(i)) {
                total = total + 366;
            } else {
                total = total + 365;
            }
        }

        for (int i = 0; i < month; i++) {
            total = total + getNumberOfDaysInMonths(year, i);
        }
        return total;
    }

    public static int getNumberOfDaysInMonths(int year, int month) {

        if ((month == 1) || (month == 3) || (month == 5) || (month == 7)
                || (month == 8) || (month == 10) || (month == 12)) {
            return 31;
        }
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            return 30;
        }
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 0;
    }


    public static boolean isLeapYear(int year) {
        //	return true;
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    private static void printMonthTitle(int year, int month) {
        System.out.println("            " + getMonthName(month) + "  " + year);
        System.out.println("---------------------------");
        System.out.println("   日  月  火  水  木  金  土");
    }

    /**
     * 年份直接获取输入数字即可，月份要转换一下，将输入的1-12转换成对应的英文显示
     */
    private static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
        }
        return monthName;
    }


}

