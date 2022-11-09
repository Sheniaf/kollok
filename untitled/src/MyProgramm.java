import java.util.Scanner;

public class MyProgramm {

    public static class Factorial_1 {
        int n;
        int Factorial(int n) {
            int r = 1;
            for (int i = 2; i <= n; i++)
                r *= i;
            return r;
        }
    }
    public static class Factorial_2 {
        int n;
         void First_factorial(int n) {
            System.out.println(1);
            int r = 1;
            for (int i = 1; i <= n; i++) {
                r *= i;
                System.out.println(r);
            }
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Factorial_1 g = new Factorial_1;
        Factorial_2 h = new Factorial_2;
        System.out.println("Factorial n = " + g.Factorial(n));
        System.out.println("First_factorial : ");
        h.First_factorial(n);
    }
}
