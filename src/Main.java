import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    printVersion(0,2020);
    printLeapYear(2021);
    int result = deliveryDays(13);
    if (result == -1){
        System.out.println("Доставки нет");
    }
    else {
        System.out.println("Доставки займет " + result + " дней");
    }
    }
    public static void printLeapYear(int year){
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            System.out.println(year + " - год является високосным");
        }
        else {
            System.out.println(year + " - год не является високосным");
        }
    }

    public static void printVersion(int os, int year){
        int currentYear = LocalDate.now().getYear();
        if (currentYear == year && os ==1) {
            System.out.println("Установите обычную версию для Android");
        } else if (currentYear > year && os ==1) {
            System.out.println("Установите облегченную версию для Android");
        } else if (currentYear == year && os ==0) {
            System.out.println("Установите обычную версию для iOS");
        } else {
            System.out.println("Установите облегченную версию для iOS");
        }

    }
    public static int deliveryDays(int distance){
        if (distance > 100) {
            return -1;
        }
        int deliveryDay = 1;
        if (distance > 20) {
            deliveryDay++;
        }
        if (distance > 60) {
            deliveryDay++;
        }
        return deliveryDay;
    }

}