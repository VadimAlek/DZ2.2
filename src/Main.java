import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task1

        int yaer = 2022;
        printYaarInfo(yaer);

    //task2

    suggestInstallOs (0,2018);



    //task3
    int distance = 95;
    System.out.println (calculateDeliveryDays(95));
}
    private static void printYaarInfo (int year){
        if (isLeapYear (year)) {
            printLeapYear(year);
        }else {
            printNonLeapYear (year);
        }
    }

    private static void suggestInstallOs (int os, int deviceYear){
        String resultString = buildResultString (os, deviceYear);
        System.out.println(resultString);
    }
    private static int calculateDeliveryDays(int distance) {
        int defaultDeliveryDays = 1;
        if (distance <= 20) {
            return defaultDeliveryDays;
        } else {
            return ((int) Math.ceil(distance - 20 / 40d)) + defaultDeliveryDays;
        }
    }
    private static String buildResultString (int os, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        StringBuilder stringBuilder = new StringBuilder();
        if (deviceYear < currentYear) {
            StringBuilder.append("Установите full-версию для ");
        }
        if (os == 1) {
            stringBuilder.append("Android");
        } else if (os == 2) {
            stringBuilder.append("iOs");
        }
        return stringBuilder.toString();
    }
    private static void printLeapYear(int year) {
        System.out.println("Год " + year + " - високосный");
    }
    private static void printNonLeapYear(int year) {
        System.out.println("Год " + year + " - не високосный");
    }
    private static boolean isLeapYear (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}





