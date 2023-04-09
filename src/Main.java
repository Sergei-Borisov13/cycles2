public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int savings = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_00) {
            month = month + 1;
            total = total + savings;
        }
        System.out.println("Месяц " + month + " ,сумма накоплений равна " + total + " рублей");
    }
    public static void task2(){
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10){
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        int a = 11;
        while (a > 1){
            a = a - 1;
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void task3(){
        System.out.println("Задача 3");
        int size = 12_000_000;
        int birthRate = size / 1000 * 17;
        int mortality = size / 1000 * 8;
        int year = 0;
        while (year < 10){
            size = size + birthRate - mortality;
            year = year + 1;
            System.out.println("Год " + year + " , численность населения составляет " + size);
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int total = 15000;
        int month = 0;
        while (total < 12_000_000) {
            month = month + 1;
            total = total + total / 100 * 7;
            System.out.println("Месяц " + month + " сумма накоплений " + total);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int total = 15000;
        int month = 0;
        while (total < 12_000_000) {
            month = month + 1;
            total = total + total / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + total);
            }
        }
        System.out.println("Месяц " + month + " сумма накоплений " + total);
    }
    public static void task6(){
        System.out.println("Задача 6");
        int total = 15000;
        int month = 0;
        while (month < 108){
            month = month + 1;
            total = total + total / 100 * 7;
            if(month % 6 == 0){
                System.out.println("Месяц " + month + " сумма накоплений " + total);
            }
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
        int friday = 1;
        for (; friday <=31; friday = friday + 7){
            System.out.println("Сегодня пятница,  " + friday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8(){
        System.out.println("Задача 8");
        int frequency = 79;
        int startYear = 1823;
        int stopYear = 2123;
        int year = 0;
        while (year < stopYear){
            year = year + frequency;
            if(year >startYear && year < stopYear){
                System.out.println(year);
            }
        }
    }
}