import java.util.Scanner;
public class program_025evenBitwise {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the bitwise Even / odd\n\n");
        System.out.print("Enter the number You want to check using the Bitwise operator: ");
        int num1 = sc.nextInt();

        int result = num1 & 1;
        if(result == 1){
            System.out.println("The given number is the odd Number");
        }
        else{
            System.out.println("The given number is the even number");
        }
    }
}
