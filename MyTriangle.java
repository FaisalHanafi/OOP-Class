import java.util.Scanner;
import java.math.*;
public class MyTriangle
{
    public static boolean isValid (double side1, double side2, double side3)
    {
        double sum=0;
        
        boolean valid=false;
        
        sum=side1+side2;
        
    
        if(sum>side3)
        {
         valid = true;   
        }
        return valid;
    }
    public static double area(double side1, double side2, double side3)
    {
        double area=0;
        double s3=0;
        double s=0;
        s3=side1+side2+side3;
        s=s3/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num1=0,num2=0,num3=0;
        
        System.out.println("Please enter the 1st integer:");
        num1 = input.nextDouble();
        System.out.println("Please enter the 2st integer:");
        num2 = input.nextDouble();
        System.out.println("Please enter the 3st integer:");
        num3 = input.nextDouble();
        
        System.out.println(isValid (num1, num2, num3));
        
        System.out.println(area (num1, num2, num3));
        
    }
    
}
