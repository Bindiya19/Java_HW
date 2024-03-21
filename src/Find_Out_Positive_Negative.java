//WAP to input any number and fid our if it is positive , negative or zero
import java.util.Scanner;

public class Find_Out_Positive_Negative
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = scanner.nextInt();
        if (number>0)
            //use >,< operators conditions
        {
            System.out.println("Given number is positive.");
        }
        else if (number<0)
        {
            System.out.println("Given number is negative.");
        }
        else
        {
            System.out.println("Given number is zero.");
        }
    }
}


