package guru.qa;

public class Main {

    public static void main(String[] arg) {

        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        //Арифметические операции
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (a--));
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));

        // Логические и сравнения
        if (a > b && c < d) {
            System.out.println("True-True");
        } else {
            System.out.println("False-False");
        }

        if (d > a || c < b) {
            System.out.println("True-True");
        } else {
            System.out.println("False-False");
        }

        //переполнение при вычислениях
        int e = Integer.MAX_VALUE;
        System.out.println("e + 1 = " + (e + 1));

        //комбинация типов данных
        int f = 25;
        double g = 30.35;

        System.out.println("e + g = " + (a + b));
        System.out.println("e - g = " + (a - b));
        System.out.println("e * g = " + (a * b));
        System.out.println("e / g = " + (b / a));






    }
}