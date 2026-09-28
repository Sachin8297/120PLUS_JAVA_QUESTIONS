import java.util.Scanner;
public class program_7perimeterProgram {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate the perimeter of rectangle");
        System.out.print("Enter the side 1 of perimeter in cms: ");
        float side1 = input.nextFloat();
        System.out.print("Enter the side 2 of perimeter in cms: ");
        float side2 = input.nextFloat();
        System.out.print("Enter the side 3 of perimeter in cms: ");
        float side3 = input.nextFloat();
        System.out.print("Enter the side 4 of perimeter in cms: ");
        float side4 = input.nextFloat();
        float rectangle = side1+side2+side3+side4;
        System.out.println("The perimeter of rectangle is: "+rectangle+ "cm");
    }
}
