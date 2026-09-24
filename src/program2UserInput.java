import java.util.Scanner;
public class program2UserInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome "+ name + " to KG coding");
    }
}
