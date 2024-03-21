//Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel or Consonant, depending on the user input.
import java.util.Scanner;

//Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel or Consonant, depending on the user input.
public class Vowel_Or_Consonant
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any alphabet letter");
        char alpha=scanner.next().charAt(0);
                                               //logic|| or use.
        if  (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ||
              alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U')
      {
          System.out.println("Input letter is Vowel.");
      }
        else
            System.out.println("Input letter is Consonant.");
    }
}
