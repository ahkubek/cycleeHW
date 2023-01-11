public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++)
            System.out.println(i);
        System.out.println("ЗАДАЧА2--------------------------------");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

        }
        System.out.println("ЗАДАЧА3-------------------------------- ");
        for (int b = 0; b < 17; b = b + 2) {
            System.out.println(b);
        }
        System.out.println("ЗАДАЧА4----------------------------------");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println("ЗАДАЧА5----------------------------------");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }
        System.out.println("ЗАДАЧА6----------------------------------");
        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("ЗАДАЧА7-------------------------------------");
        for (int i = 1; i < 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("ЗАДАЧА 8--------------------------------------");
        int contribution = 29000;
        int total = 0;

        for (int i = 0; i < 12; i++)
            total = total + contribution;
        {
            System.out.println(total);
        }
        System.out.println("задача9--------------------------------------");
        int contribution1 = 29000;
        int total1 = 0;
        for (int i = 0; i < 12; i++){
            total1 = total1+total1 / 100;
            total1 = total1 + contribution1;
            System.out.println("месяц "+i+ " итого"+total1);
        }
        System.out.println("ЗАДАЧА 10--------------------------------------");

    }
}
