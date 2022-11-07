import java.util.Scanner;
public class TestMyInteger{
    public static void main(String[] args)
    {
        MyInteger num1 = new MyInteger(4);
        MyInteger num2 = new MyInteger(9);
        MyInteger num3 = new MyInteger(17);
        MyInteger num4 = new MyInteger(113);
        MyInteger num5 = new MyInteger(873);
        
        Scanner input = new Scanner(System.in);
        int updt;
        
        System.out.println("Input1 is: "+num1.getvalue()+". Is it even? "+num1.isEven()+". Or is it odd? "+num1.isOdd()); 
        System.out.println("Input3 is "+num3.getvalue()+". Is it a prime number? "+num3.isPrime());
        System.out.println("Please input the input 6 value: ");
        MyInteger num6 = new MyInteger(updt=input.nextInt());
        System.out.println("A new object input 6 is: "+num6.getvalue());
        System.out.println("Input 4 is :"+num4.getvalue());
        System.out.println("Input 5 is :"+num5.getvalue());
        System.out.println("Is Input 4 and Input equals to each other? "+num4.equals(num5));
        System.out.println("Is 45 an odd number? "+MyInteger.isOdd(45));
        System.out.printf("Change array of numerics 4 7 2 to int 472.", MyInteger.parseInt(new char[] {'4', '7', '2'}));
        System.out.printf("Convert String to int "+ MyInteger.parseInt("454"));
        
        
    }
}