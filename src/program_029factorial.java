import java.math.BigInteger;
import java.util.Scanner;
public class program_029factorial {
    public static void main(String args[]){
        greetUser();
        int num = input();
        long  result = factorial(num);
        System.out.println(result);

    }
    public static void greetUser(){
        System.out.println("Welcome to the Factorial calculator");
    }
    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        return num;
    }
    public static long factorial(int num){
        if(num < 2){
            return 1;
        }
        else {
            int i = 1;
            long fact = 1;
            while(i <= num){
                fact = fact*i;
                i++;

            }
            return fact;

        }

    }
}
