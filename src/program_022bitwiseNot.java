import java.util.Scanner;
public class program_022bitwiseNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the bitwise Not");
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        //System.out.print("Enter the second Number: ");
        //int num2 = sc.nextInt();

        int result = ~num1;
        System.out.println("The bitwise of "+num1+"is: "+result);

    }
}
