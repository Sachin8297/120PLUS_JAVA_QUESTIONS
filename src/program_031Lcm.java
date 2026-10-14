import java.util.Scanner;
public class program_031Lcm {
     static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Welcome to the Lcm Finder");
        int num1 = input();
        int num2 = input();
        long result = lcmFinder(num1,num2);
        System.out.println("The Lcm of two Numbers is: "+result);

    }

    public static int  input(){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Welcome to the Lcm Finder");
        System.out.print("Enter the Number 1 & 2: ");
        int num = sc.nextInt();
        return num;
    }
    public static long lcmFinder(int num1,int num2){
        long product = num1*num2;
        int i = 1;
        while(i <= product){
            if(i % num1 == 0 && i % num2 == 0 ){
                return i;
            }
            i++;

        }
        return 0;
    }
}
