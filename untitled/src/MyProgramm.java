import java.util.Scanner;

public class MyProgramm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Factorial g = new Factorial(n);
        System.out.println("Factorial " + n + " = " + g.Factorial1());
        System.out.println("----------------------------------------------------");
        int[]array = g.Factorial2();
        for(int i = 0; i < array.length; i++){
            System.out.println("Factorial " + i + " = " + array[i]);
        }
    }
}
