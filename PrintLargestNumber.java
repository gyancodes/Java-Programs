import java.util.Scanner;

public class PrintLargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = in.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = in.nextInt();

        if(num1 > num2){
            System.out.println("Greater: " + num1);
        }
        else if(num2 > num1) {
            System.out.println("Greater: " + num2);
        }
        else{
            System.out.println("Both are Equal10");
        }

       in.close();
        
    }
}
