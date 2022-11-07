import java.util.Scanner;
import java.math.*;

public class ASSIGNMENT3_CODING_Q1
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int k = 0;
        System.out.println("Please input the amount of data to be input: ");
        double[] income = new double [k=input.nextInt()];
        
        for(int i=0;i<income.length;i++)
        {
        System.out.println("Please input the amount of income: ");
        income[i] = input.nextDouble();
    }
        
    double min=calcmin(income);
    calcndispfinal(income,min);
} 

public static double calcmin(double[] arr1)
{
    double min = arr1 [0];
    
    for(int m=0;m<arr1.length;m++)
    {
        if(arr1[m]<min)
        {
            min=arr1[m];
        }
        
    }

    return min;
}

public static void calcndispfinal(double[] arra1,double mini)
{
    double cond1= mini*1.2;;
    int count_abv_min = 0;
    double disp_abv_min = 0;
    for(int y =0;y<arra1.length;y++)
    {
    
    if(arra1[y]>=cond1)
            {
                
                disp_abv_min=arra1[y];
                System.out.println("The income value of more than 20% higher than the minimum value is amounted to :"+disp_abv_min);
                count_abv_min++;
            }
        }
            System.out.println("The number of income that is at least 20% higher than that of minimum income is : "+count_abv_min++);
}
}




