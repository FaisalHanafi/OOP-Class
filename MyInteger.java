public class MyInteger{
    private int value;
    public MyInteger()
    {
    }
    public MyInteger(int value)
    {
        this.value=value;
    }
    public int getvalue()
    {
        return value;
    }
    public boolean isEven()
    {
        if(value%2==0)
        return true;
        else
        return false;
    }
    public boolean isOdd()
    {
        if(value%2!=0)
        return true;
        else
        return false;
    }
    public boolean isPrime()
    {
      boolean prime = true;
      for(int i=2;i<=value/2;i++)
      {
          if(value%i==0)
          {
              prime=false;
              break;
          }
      }
      if(prime!=false)
      {
          prime=true;
        }
        else
        {
        prime=false;}
        return prime;
    }
    public static boolean isEven(int testvalue)
    {
        if(testvalue%2==0)
        return true;
        else
        return false;
    }
    public static boolean isOdd(int testvalue)
    {
        if(testvalue%2!=0)
        return true;
        else
        return false;
    }
    public static boolean isPrime(int testvalue)
    {
        boolean prime=true;
        for(int i=2;i<=testvalue;i++)
        {
            if(testvalue%i==0)
            {
                prime=false;
                return prime;
            }
            if(prime!=false)
            {
                prime=true;
            }
            else
            {
                prime=false;
            }
        }
        return prime;
    }
    public static boolean isOdd(MyInteger testvalue)
    {
        return testvalue.isOdd();
    }
    public static boolean isEven(MyInteger testvalue)
    {
        return testvalue.isEven();
    }
    public static boolean isPrime(MyInteger testvalue)
    {
        return testvalue.isPrime();
    }
    public boolean equals(int testvalue)
    {
        if(testvalue == value)
        return true;
        else 
        return false;
    }
    public boolean equals(MyInteger testvalue)
    {
        if(testvalue.value==this.value)
        return true;
        else
        return false;
    }
    public static int parseInt(char[] values1)
    {
        int sum=0;
        for(char i : values1)
        {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }
    public static int parseInt(String values1)
    {
        return Integer.parseInt(values1);
    }
    }
