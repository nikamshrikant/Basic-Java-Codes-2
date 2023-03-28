import java.util.*;
class code4
{
    public static void main(String[] args)
    {
        int var;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the number: ");
        var=sc.nextInt();
        if(var>0)
        {
           System.out.println(" Number is positive ");
        }
        else if(var==0)
        {
            System.out.println(" Number is positive & zero , neutral ");
        }
        else 
        {
            System.out.println(" Number is negative ");
        }
    }
}