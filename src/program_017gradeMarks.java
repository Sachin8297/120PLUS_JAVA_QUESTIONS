import java.util.Scanner;
public class program_017gradeMarks {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to percentage calculator \n\n");
        System.out.print("Enter the percentage the you got: ");
        float grade = sc.nextFloat();

        if(grade >= 90){
            System.out.println("welcome to the A grade students");
        }
        else if (75 <= grade){
            System.out.println("Welcome to the B grade students");
        }
        else if (60 <= grade){
            System.out.println("Welcome to the C grade students");
        }
        else if (30 <= grade){
            System.out.println("Welcome to the D grade students");
        }
        else{
            System.out.println("Welcome to the E grade students");
        }
    }
}
