import java.util.Scanner;

//same as above but pass or fails on the basis of..student needs to pass all the subjects
public class Pass_Or_Fail_All_Subj {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 3 subjects marks :");

        System.out.print("Marks of science is : ");
        int subj1=scanner.nextInt();

        System.out.print("Marks of Maths is : ");
        int subj2=scanner.nextInt();

        System.out.print("Marks of English is : ");
        int subj3=scanner.nextInt();

        boolean result;
        if (subj1>=35 && subj2>=35 && subj3>=35)
            System.out.println("Result is pass.");

        else
            System.out.println("Result is fail.");
    }
}
