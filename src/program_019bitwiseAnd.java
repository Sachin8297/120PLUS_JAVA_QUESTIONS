import java.util.Scanner;
public class program_019bitwiseAnd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the bitwise AND\n\n");
        System.out.print("Enter the first Number: ");
        int Num1 = sc.nextInt();
        System.out.print("Enter the second Number: ");
        int Num2 = sc.nextInt();

        int result = Num1 & Num2;
        System.out.println("The bitwise of "+Num1+" and "+Num2+" is "+result);

    }
}
