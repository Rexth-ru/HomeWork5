import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }

    public static void task1() {
        System.out.println("Задача 1,2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName +" "+ firstName +" "+ middleName ;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+ fullName.toUpperCase());
    }
    public static void task2() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));
    }
    public static void task3() {
        System.out.println("Задача 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name +"!");
    }
    public static void task4() {
        System.out.println("Задача 5");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        System.out.println("Температура воздуха сегодня: " + t + " градусов.");
    }
    public static void task5() {
        System.out.println("Задача 6");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int month = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int year = scanner2.nextInt();
        System.out.println(day + ":" + month + ":" + year);
    }
    public static void task6() {
        System.out.println("Задача 7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        System.out.println("Имя помощника:");
        Scanner scanner1 = new Scanner(System.in);
        String help = scanner1.nextLine();
        System.out.println("Количество сообщений");
        Scanner scanner2 = new Scanner(System.in);
        int message = scanner2.nextInt();
        System.out.println("Привет," + name + "! Это твой помощник " + help + ". У тебя " + message + " новых писем.");
    }
}