import java.util.Scanner;
public class program_016leapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the leap year checker");
        System.out.print("Enter the year you want to check for a leap year: ");
        int year = sc.nextInt();

        if( year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0)){
            System.out.println("The given "+year+" year is a leap year");
        }
        else {
            System.out.println("The given "+year+" year is not a leap year");
        }
    }
}
