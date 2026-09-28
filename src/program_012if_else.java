import java.util.Scanner;
public class program_012if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to  driving licence \n");
        System.out.print("please, Enter  your age:  ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("congrats, you are eligible for driving");
        } else {
            System.out.println("Opps , you are not eligible for driving");
        }
    }
}
