import java.util.Scanner;
public class ASSIGNMENT1_CODING_Q1
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please enter three integer :");
       int num1 = input.nextInt();
       int num2 = input.nextInt();
       int num3 = input.nextInt();
       
       if     (num1>num2 && num1>num3 && num2>num3)
       {
           System.out.println("The entered number in decreasing is : "+num1+", "+num2+", "+num3);
       }
       else if(num1>num2 && num1>num3 && num3>num2)
       {
           System.out.println("The entered number in decreasing is : "+num1+", "+num3+", "+num2);
       }
       else if(num2>num1 && num2>num3 && num1>num3)
       {
           System.out.println("The entered number in decreasing is : "+num2+", "+num1+", "+num3);
       }
       else if(num2>num1 && num2>num3 && num3>num1)
       {
           System.out.println("The entered number in decreasing is : "+num2+", "+num3+", "+num1);
       }
       else if(num3>num2 && num3>num1 && num1>num2)
       {
           System.out.println("The entered number in decreasing is : "+num3+", "+num1+", "+num2);
       }
       else if(num3>num2 && num3>num1 && num2>num1)
       {
           System.out.println("The entered number in decreasing is : "+num3+", "+num2+", "+num1);
       }
       else 
       {    
           System.out.println("The number entered is incorrect!");
       }
}
}
