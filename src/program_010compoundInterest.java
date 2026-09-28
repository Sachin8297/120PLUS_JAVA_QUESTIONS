import java.util.Scanner;
public class program_010compoundInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculate the compound Interest: \n\n");
        System.out.print("Enter the principle value to calculate the \"Interest:\" ");
        float principal = sc.nextFloat();
        System.out.print("Enter the rate at which the interest is: ");
        float rate = sc.nextFloat();
        System.out.print("Enter the time for which the principle is taken: ");

        float time = sc.nextFloat();
        double CI = principal*(Math.pow((1 + rate / 100),time));// we have used here double because math.pow returns double.

        System.out.println("The compound Interest is: "+CI);
    }
}
