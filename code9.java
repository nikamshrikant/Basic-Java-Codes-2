import java.net.SocketTimeoutException;
import java.util.*;
class code9
{
    public static void main(String[] args)
    {
        int dayNo;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Day Number = ");
        dayNo=sc.nextInt();
        if(dayNo==0)
        {
            System.out.println("you entered zero , invalid ");
        }
        else if(dayNo>7)
        {
            System.out.println("You entered greater day No.");
        }
        else if(dayNo==1)
        {
            System.out.println(" Monday");
        }
        else if(dayNo==2)
        {
            System.out.println("Tuesday");
        }
        else if(dayNo==3)
        {
            System.out.println("Wednesday");
        }
        else if(dayNo==4)
        {
            System.out.println("Thursday");
        }
        else if(dayNo==5)
        {
            System.out.println("Friday");
        }
        else if(dayNo==6)
        {
            System.out.println("Saturday");
        }
        else if(dayNo==7)
        {
            System.out.println("Sunday");
        }
        else {
            System.out.println("You Entered NEGATIVE number");
        }   
     }
}