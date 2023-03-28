import java.util.*;
class code5
{
    public static void main(String[] args)
    {
        int var;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        var=sc.nextInt();
        if(var>5)
        {
            System.out.println("Number is greater than 5");
        }
        else if(var==0)
        {
            System.out.println("Zero");
        }
        else if(var==1)
        {
            System.out.println("One");
        }
        else if(var==2)
        {
            System.out.println("Two");
        }
        else if(var==3)
        {
            System.out.println("Three");
        }
        else if(var==4)
        {
            System.out.println("Four");
        }
        else if(var==5)
        {
            System.out.println("Five");
        }
        else
        {
            System.out.println(" Number is negative ");
        }
    }
}