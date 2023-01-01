import java.util.Scanner;

public class ReturnTypeFunc{
    public static void main(String[] args) {


        // int ans = sum();
        // System.out.println(ans);

        // String message = greet();
        // System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = in.next();
        String greetMessage = getName(name);
        System.out.println(getName(greetMessage));
        in.close();

    }

    // Int Return Type
    //  static int sum(){
    //     Scanner in = new Scanner(System.in);
    //     System.out.print("Enter 1st Number: ");
    //     int num1 = in.nextInt();
    //     System.out.print("Enter 2nd Number: ");
    //     int num2 = in.nextInt();
    //     int sum = num1 + num2;
    //     return sum;
    //  }

     // String Return Type
    //  static String greet(){
    //     String greeting = "How are you";
    //     return greeting;


    //  }


     // Passing arguments
     static String getName(String name){
        String message = "Hello" + name;
        return message;
     }
}