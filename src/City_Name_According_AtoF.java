 //Input any alphabet from a to f and print their city name accordingly (use if else) any other
 //alphabet should be invalid entry
import java.util.Scanner;

public class City_Name_According_AtoF
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet from A TO F");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'A')
        {
            System.out.println("City name is a Atalanta.");
        }
        else if (alphabet == 'b' || alphabet == 'B')
        {
            System.out.println("City name is Brighton.");
        }
        else if (alphabet == 'c' || alphabet == 'C')
        {
           System.out.println("City name is Coventry.");
        }
        else if (alphabet == 'd' || alphabet == 'D')
        {
            System.out.println("City name is Dover.");
        }
        else if (alphabet == 'e' || alphabet == 'E')
        {
           System.out.println("City name is Edinburgh.");
        }
        else if (alphabet == 'f' || alphabet == 'F')
        {
           System.out.println("City name is Frankfurt .");
        } else
            System.out.println("invalid entry.");




    }
}
