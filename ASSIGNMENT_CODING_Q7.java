import java.util.Scanner;
public class ASSIGNMENT_CODING_Q7
{
    public static void main(String[] args)
    {
        int coupon=0;
        int candy=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of money you have: ");
        int money=input.nextInt();
        coupon=money;
        candy=money;
        do{
            coupon=coupon-6;
            candy=candy+1;
            coupon=coupon+1;
        }while( coupon>=6);
        System.out.println("You can have " + candy + " candy" );
        System.out.println("and the remainder of coupon you have is " + coupon);
    }
}
