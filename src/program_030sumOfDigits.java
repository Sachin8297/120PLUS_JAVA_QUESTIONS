import java.util.Scanner;
public class program_030sumOfDigits {
    public static void main(String args[]){
        greetUser();
        int num = input();
        int result =sumOfDigits(num);
        System.out.println("The sum of the digits are: "+result);

    }

    public static void greetUser(){
        System.out.println("Welcome to the sum of digits");
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to calculate the sum of digits: ");
        int num = sc.nextInt();
        return num;
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num!=0){
            int lastdigit = num % 10;
            sum = sum + lastdigit;
            num = num / 10;
        }
        return sum;
    }

}
