import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle Amount: ");
        int p = sc.nextInt();

        System.out.print("Enter Rate of Interest: ");
        int r = sc.nextInt();

        System.out.print("Enter Time: ");
        int t = sc.nextInt();

        sc.close();

        int SimpleInterest = (p*r*t)/100;


        System.out.println("Simple Interest: " + SimpleInterest);
        
    }
}
