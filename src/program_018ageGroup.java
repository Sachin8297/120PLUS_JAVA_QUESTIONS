import java.util.Scanner;
public class program_018ageGroup {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the age group category\n\n ");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 13){
            System.out.println("You are a child, below 13 you are");
        }
        else if(age < 20){
            System.out.println("you are a teen, you are below 20");
        }
        else if(age < 60){
            System.out.println("you are a adult, you are below 60");
        }
        else if(age > 60){
            System.out.println("welcome to the senior citizen club");
        }
    }
}
