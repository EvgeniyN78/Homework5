public class Main {
    public static void main(String[] args) {

        // Задание №1
        System.out.println("Задание 1.");

        for (int i = 1; i < 11; i++) {
            System.out.println("Число " + i);
        }
        System.out.println("");

        // Задание №2
        System.out.println("Задание 2.");

        for (int i = 10; i > 0; i--) {
            System.out.println("Число " + i);
        }
        System.out.println("");

        // Задание №3
        System.out.println("Задание 3.");

        for (int i = 0; i < 18; i = i +2) {
            System.out.println("Число " + i);
        }
        System.out.println("");

        // Задание №4
        System.out.println("Задание 4.");

        for (int i = 10; i > -11; i --) {
            System.out.println("Число " + i);
        }
        System.out.println("");

        // Задание №5
        System.out.println("Задание 5.");

        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("");

        // Задание №6
        System.out.println("Задание 6.");

        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("");

        // Задание №7
        System.out.println("Задание 7.");

        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("");

        // Задание №8
        System.out.println("Задание 8.");

        int sumDeposit = 29_000;
        int total = 0;
        int rate = 12;

        for (int i = 1; i < 13; i++) {
            total = total + (total / 100 * rate / 12);
            total = total + sumDeposit;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("");
    }
}