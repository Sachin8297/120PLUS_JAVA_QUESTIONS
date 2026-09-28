import java.util.Scanner;
public class program_006productFloating {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second number2: ");

        float num2 = input.nextFloat();
        float product = (num1 * num2);
        System.out.println("The product of two numbers is: " +product);
    }
}
