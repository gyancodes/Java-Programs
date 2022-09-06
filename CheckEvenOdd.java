import java.util.Scanner;

class CheckEvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        
        int num = sc.nextInt();
        sc.close();


        if(num % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }



    }
}