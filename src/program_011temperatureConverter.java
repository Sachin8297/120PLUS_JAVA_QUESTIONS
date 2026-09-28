import java.util.Scanner;
public class program_011temperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Converter: ");
        System.out.print("Enter the Temperature in Fahrenheit: ");

        float Fah = sc.nextFloat();
        float Celsius = (Fah - 32)* (5.0f / 9.0f);

        System.out.println("The temperature in celsius is: "+ Celsius + "C");
    }

}
