import java.util.Scanner;

//WAP input any number, the print Day name of the week accordingly by using if else
public class Print_Day_Of_Week
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number between 0 to 6 to find Day of the week. : ");
        int num=scanner.nextInt();
        String dayname;
            if(num==0)
            {dayname= "Sunday";
            }
             else if(num==1)
             {dayname="Monday";
             }
             else if(num==2)
             {dayname="Tuesday";
             }
             else if(num==3)
             { dayname="Wednesday";
             }
             else if(num==4)
              {dayname="Thursday";
              }
             else if(num==5)
             {dayname="Friday";
             }
             else if(num==6)
             {dayname="Saturday";
             }
             else
             { dayname= "Invalid Number";}
        System.out.println( num+" Day of the week is " +dayname+".");
    }

}
