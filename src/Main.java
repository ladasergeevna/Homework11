//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        completeTask1();
        completeTask2();
        completeTask3();
    }

    //Task1
    public static void completeTask1() {
        int year = 2025;
        System.out.println("Task1");
        if (determineLeapYear(year)) {
            System.out.println(year + " год - високосный год");
        }
        else {
            System.out.println(year + " год - невисокосный год");
        }

    }
    public static boolean determineLeapYear (int year) {
        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //Task2
    public static void completeTask2() {
        int operationSystem = 1;
        int clientDeviceYear = 2023;
        System.out.println(determineVersionOS(operationSystem,clientDeviceYear));
        }

    public static String determineVersionOS (int operationSystem, int clientDeviceYear){
        int currentYear = 2024;
        System.out.println();
        System.out.println("Task2");
        if (operationSystem == 0 && clientDeviceYear < currentYear)  {
          return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (operationSystem == 0 && clientDeviceYear >= currentYear) {
            return "Установите обычную версию приложения для iOS по ссылке";
        } else if (operationSystem == 1 && clientDeviceYear < currentYear) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else if (operationSystem == 1 && clientDeviceYear >= currentYear) {
            return "Установите обычную версию приложения для Android по ссылке";
        } else {
            return "Исходные данные некорректные!";
        }

    }

    // Task3
    public static void completeTask3() {
        int deliveryDistance = 195;
        System.out.println(determineAmountDaysDelivery(deliveryDistance));
    }

    public static String determineAmountDaysDelivery(int deliveryDistance){
        System.out.println();
        System.out.println("Task3");
        int deliveryDay = 1;
        if(deliveryDistance <= 20) {
           return "Доставка займет " + deliveryDay + " день";
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
           return "Доставка займет " + (deliveryDay + 1) + " дня";
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return"Доставка займет " + (deliveryDay + 2) + " дня";
        } else {
           return "Доставки нет";
        }

    }

}