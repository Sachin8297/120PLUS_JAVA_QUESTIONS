import java.util.Scanner;
public class program_015greatestThreeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the three Numbers club");
        System.out.print("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Number2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the number3: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("The "+num1+ " is greatest");
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println("The "+num2+ " is greatest");
        }
        else {
            System.out.println("The "+num3+ " is greatest");
        }
    }

}
