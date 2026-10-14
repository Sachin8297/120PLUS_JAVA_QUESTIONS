import java.util.Scanner;
public class program_021bitwiseXor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the bitwise Xor\n\n");
        System.out.print("Enter the first Number: ");
        int First = sc.nextInt();
        System.out.print("Enter the second Number: ");
        int Second = sc.nextInt();

        int result = First ^ Second;
        System.out.println("The result of "+First+" and"+Second+" is: "+result);
    }
}
