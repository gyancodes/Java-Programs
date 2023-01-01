import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        sum();
        sum();

    }

   static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}

// 2 Methods to print the maximum and the minimum number respectively among
// three numbers entered by the user