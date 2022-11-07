import java.util.Scanner;
import java.math.*;

public class ASSIGNMENT3_CODING_Q2{
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        int size = 0;
        System.out.println("How many numbers will you enter?");
        int[] arrayint = new int [size=input.nextInt()];
        System.out.println("Enter " + size + " integers, one per line");
        for(int i = 0;i<arrayint.length;i++)
        {
            arrayint[i] = input.nextInt();
        }
        double prod=calcprod(arrayint);
        System.out.println("The product is " + prod + ".");
        calcperce(arrayint,prod);
    }
    public static double calcprod(int[] arr1)
    {
        double produ=1;
        for(int d=0;d<arr1.length;d++)
        {
        produ = produ*arr1[d];
    }
    return produ;
}

public static void calcperce(int[] arra1,double prod)
{
    for(int l=0;l<arra1.length;l++)
    {
        double percen = ((arra1[l]/prod)*100);
        System.out.println(arra1[l] +", which is " + percen +"% of the product.");
    }
}
}