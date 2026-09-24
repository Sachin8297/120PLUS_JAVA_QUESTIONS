import java.util.Scanner;
public class program_3AddTwoNumbers {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);// jo bhi system pr input diya h usko utha lo
        System.out.print("Enter the two number: ");
        int num1 = input.nextInt();// jo bhi system se phla input aya h usko isme dal do
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.print("The sum of two numbers is : "+ sum);
    }
}
