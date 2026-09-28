import java.util.Scanner;
public class program_8areaRectangle {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate the area of rectangle: ");
        System.out.print("Enter the the base of rectangle in cm: ");
        float base = input.nextFloat();
        System.out.print("Enter the Height of rectangle in cm: ");
        float height = input.nextFloat();

        float area = 0.5f*base*height;
        System.out.println("The area of rectangle is: "+area+ "cms2");

    }
}
