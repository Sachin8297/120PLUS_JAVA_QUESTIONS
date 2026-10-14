import java.util.Scanner;
public class program_033gcdFinder {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("Welcome to the gcd Finder ");
       int num1 =  input();
       int num2 = input();
       int result = least(num1,num2);
       System.out.println("The Smallest number is: "+result);
       int gcdresult = gcd(num1, num2);
       System.out.println("The Gcd of two Number is : "+gcdresult);

    }
    public static int input(){
        //System.out.println("Welcome to the gcd Finder ");
        System.out.print("Enter the number1: ");
        int num1 = sc.nextInt();
        return num1;
    }
    public static int least(int first, int second){
        if(first < second){
            return first;
        }
        else {
            return second;
        }

    }
    public static int gcd(int first, int second){
        int least = least(first,second);
        int i = 1;
        int gcd = 1;
        while (i <= least){
            if(first % i == 0 && second % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;

    }
}
