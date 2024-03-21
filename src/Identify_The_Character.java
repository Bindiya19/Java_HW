//Enter any value and the find out if it is number (0-9) or an alphabet or symbol
import java.util.Scanner;
public class Identify_The_Character
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char character = scanner.next().charAt(0);
            
            if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z'))
            //use of >=,<=,&&,|| operators in conditions
        {
            System.out.println("Given character is an alphabet.");
        }
            else if (character >= '0' && character <= '9')
        {
            System.out.println("Given character is a number.");
        }
             else
        {
             System.out.println("Given character is symbol.");
        }
    }
}
