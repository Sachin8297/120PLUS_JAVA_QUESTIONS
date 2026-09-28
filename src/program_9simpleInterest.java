import java.util.Scanner;
public class program_9simpleInterest {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate the Interest calculator");
        System.out.print("Enter the principle value to calculate the Interest: ");
        float principle = input.nextFloat();
        System.out.print("Enter the time for which the principle is taken: ");
        float time = input.nextFloat();
        System.out.print("Enter the rate at which the principle is taken: ");

        float rate = input.nextFloat();
        float SI = (principle*rate*time)/100;

        System.out.println("The Interest for the principle is: "+ SI);
    }
}
