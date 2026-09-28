import java.util.Scanner;
public class program_014oddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The given "+num+ " is even");
        }
        else{
            System.out.println("The given "+num+ " is odd");
        }
    }
}
