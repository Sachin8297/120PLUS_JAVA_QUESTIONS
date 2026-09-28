import java.util.Scanner;
public class program_005arithmeticOperators {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();

//        int add = a + b;
//        int sub = a - b;
//        int mult = a * b;
//        int div = a / b;
//        int floor = a % b;

        System.out.println("The result for Operators are as follows ");
        System.out.println("The addition of two numbers is: "+(a + b));
        System.out.println("The subtraction of two numbers is: "+(a - b));
        System.out.println("The multiplication of two numbers is: "+(a * b));
        System.out.println("The division of two numbers is: "+(a / b));
        System.out.println("The remainder of two numbers is: "+(a % b));

    }
}
