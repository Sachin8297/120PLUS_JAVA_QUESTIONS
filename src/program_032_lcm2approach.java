import java.util.Scanner;
public class program_032_lcm2approach {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        //static Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Lcm finder");
       int num1 = input();
       int num2 = input();
       long result = lcmFinder(num1, num2);
       System.out.println("The Lcm of two numbers are : "+result);

    }

    public static int  input() {
        //System.out.println("Welcome to the Lcm finder");
        System.out.print("Enter the number 1 & 2:  ");
        int num1 = sc.nextInt();
        return num1;

    }

    public static long lcmFinder(int num1, int num2){
        int i = 1;
        while (true){
            int factor = i * num1;
            if(factor % num2 == 0){
                return factor;
            }
            i++;
        }
    }
}
