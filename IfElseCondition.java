import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Age: ");

        int age = in.nextInt();
        in.close();

        if (age > 20) {
            System.out.println("You are Eligible to Drive!");
        } else {
            System.out.println("You are Not Eligible to Drive!");
        }
    }
}
