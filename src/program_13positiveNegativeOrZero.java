import java.util.Scanner;
public class program_13positiveNegativeOrZero {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("The given "+num+ " is positive ");
        }
        else if (num < 0){
            System.out.println("The given "+num+ " is negative ");
        }
        else{
            System.out.println("The given "+num+ " is Zero");
        }
    }
}
