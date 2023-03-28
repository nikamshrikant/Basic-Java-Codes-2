import java.util.*;
class code6
{
    public static void main(String[] args)
    {
        int monthNo;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Month Number: ");
        monthNo=sc.nextInt();
        if(monthNo>12)
        {
            System.out.println("Invalid month Number");
        }
        else if(monthNo==0)
        {
           System.out.println("Invalid month Number 0");
        }
        else if(monthNo==1)
        {
            System.out.println(" January Days - 31 ");
        }
        else if(monthNo==2)
        {
            System.out.println("February Days - 28 ");
        }
        else if(monthNo==3)
        {
            System.out.println("March Days - 31 ");
        }
        else if(monthNo==4)
        {
          System.out.println("April Days - 30 ");
        }
        else if(monthNo==5)
        {
            System.out.println("May Days - 31 ");
        }
        else if(monthNo==6)
        {
            System.out.println("June Days - 30 ");
        }
        else if(monthNo==7)
        {
            System.out.println("July Days - 31 ");
        }
        else if(monthNo==8)
        {
            System.out.println("August Days - 31 ");
        }
        else if(monthNo==9)
        {
            System.out.println("September Days - 30 ");
        }
        else if(monthNo==10)
        {
            System.out.println("Octomber Days - 31 ");
        }
        else if(monthNo==11)
        {
            System.out.println("November Days - 30 ");
        }
        else if(monthNo==12)
        {
            System.out.println("December Days - 31");
        
        }
        else{
            System.out.println("You entered Negative Number");
        }

    }
}