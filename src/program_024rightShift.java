import java.util.Scanner;
public class program_024rightShift {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the right shift Operator\n\n");
        System.out.print("Enter the Number you want to right shift: ");
        int Num1 = sc.nextInt();
        System.out.print("Enter the times you want to shift the Number: ");
        int times = sc.nextInt();

        int result = Num1 >> times;
        System.out.println("The number after right shift is: "+result);
    }
}
