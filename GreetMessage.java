import java.util.Scanner;

public class GreetMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");

        String name = sc.next();
        sc.close();

        greetMessage(name);
   

    }

    public static void greetMessage(String name) {
        System.out.println("Hello " + name);



    }

    
}
