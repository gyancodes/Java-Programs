import java.util.Scanner;

public class RupeeToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Value in Rupee: ");
        double rupee = in.nextDouble();

        double usd = 79.95;

        double result = rupee/usd;

        System.out.println("USD: " + result);

    }
}
