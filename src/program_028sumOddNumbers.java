import java.util.Scanner;
public class program_028sumOddNumbers {
    public static void main(String args[]){
        greet();
        int actual = input();
        int result = sumOddNumbers(actual);
        System.out.println("The sum of odd number from 1 to "+actual+" is "+result);

    }
    public static void greet(){
        System.out.println("welcome to the sum of odd numbers");
    }
    public static int  input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        return num;
    }
    public static int sumOddNumbers(int actual){
        int i = 1;int sum = 0;
        while(i <= actual){
            if(i % 2 != 0){
                sum+= i;
            }
            i++;
        }
        return sum;



    }




}
