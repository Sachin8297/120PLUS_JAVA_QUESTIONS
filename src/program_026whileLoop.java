import java.util.Scanner;
public class program_026whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the Number ");
        Pattern();


    }

    public static void Pattern(){
        int i = 1;
        while(i <= 5){
            int j = 1;
            while(j <= i) {
                System.out.print("* ");

                j++;
            }
            System.out.println();
            i++;

        }
    }

}
