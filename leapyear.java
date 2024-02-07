import java.util.Scanner;
public class leapyear
{
    public static void main (String [] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Number: ");
        int a= s1.nextInt();
        System.out.println("Number is: "+a);
        if(a%4==0 && a%100!=0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
    }
}
