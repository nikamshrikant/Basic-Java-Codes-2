import java.util.*;
class code3
{
 public static void main(String[] args)
 {
    int num;
    Scanner sc=new Scanner(System.in);
     System.out.println(" Enter the number: ");
     num=sc.nextInt();
     if(num<10)
     {
        System.out.println(" num is less than 10 ");
     }
     else if(num==10)
     {
        System.out.println(" num is equal to 10 ");
     }
     else 
     {
        System.out.println(" num is greater than 10 ");
     }
 }
}