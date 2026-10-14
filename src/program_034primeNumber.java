import java.util.Scanner;
public class program_034primeNumber {
    public static void main(String args[]){
        int num1 = input();
        String result = prime(num1);
        System.out.println(result);

    }
    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the prime checker ");
        System.out.print("Enter the Number greater than 1:  ");
        int num = sc.nextInt();
        return num;
    }

    public static String prime(int first){
        if(first <= 1){
            return "not prime";
        }
        int i = 2;
        while (i < first){
            if(first % i == 0){
                return "not prime";
            }
            i++;
        }
        return "prime";
    }

}
