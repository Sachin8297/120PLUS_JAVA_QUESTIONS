import java.util.Scanner;
public class program_023bitwiseLeftshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the bitwise Left shift\n\n");
        System.out.print("Enter the Number to check for the left Shift: ");
        int Num1 = sc.nextInt();

        int result = Num1 << 1;
        System.out.println("The "+Num1+" After the left shift 2 is: "+result);

    }
}
