//Input any alphabet in uppercase and print it in lowercase
import java.util.Scanner;

public class Alphabet_Swap
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any word in upper cases: ");
        String word=scanner.next();
        String lowercaseword=word.toLowerCase();
        System.out.println(word+" changed in "+lowercaseword);
       // System.out.println("Enter any alphabet in uppercase: ");
       // char alphabet= scanner.next().charAt(0);
       // char lowercaseChar = Character.toLowerCase(alphabet);
        //System.out.println( lowercaseChar+" Changed from "+ alphabet );
    }
}
