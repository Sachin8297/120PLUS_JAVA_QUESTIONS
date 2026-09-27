import java.util.Scanner;

public class program_4_SwapNumbers {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int a = input.nextInt();
        System.out.print("Enter the number2: ");
        int b = input.nextInt();
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The value of \"a\" after swap is: " +a);
        System.out.print("The value of b after swap is: "+b);

    }
}
