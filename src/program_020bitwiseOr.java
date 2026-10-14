import java.util.Scanner;
public class program_020bitwiseOr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the bitwise Or\n\n");
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        int result = first | second;
        System.out.println("The bitwise or of " +first+ " and " +second+ " is: "+result);

    }
}
