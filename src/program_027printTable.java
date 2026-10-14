import java.util.Scanner;
public class program_027printTable {
    public static void main(String args[]){
        greetUser();
        int num = input();
        table(num);

    }
    public static void greetUser(){
        System.out.println("welcome to the table calculator\n\n");
    }
    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate the table of the number: ");
        int num = sc.nextInt();
        return num;
    }
    public static void table(int num){
        int i = 1;
        while (i <= 10){
            int result = num * i;
            System.out.println(num+"X"+i+"="+result);
            i++;

        }


    }

}
