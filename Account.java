class Account{
    private int id;
    private double balance;
    private double annualInterestRate ;
    private java.util.Date dateCreated = new java.util.Date();
   
    public Account(){
        int id =0;
        double balance =0;
        double annualInteresetRate = 0;
    }
    public Account(int id, double balance)
    {
        this.id=id;
        this.balance=balance;
    }
    public Account(int id, double balance,double annualInterestRate)
    {
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }
    
    
    public int getid()
    {
        return id;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public double getbalance()
    {
        return balance;
    }
    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    public double getannualInterestRate()
    {
        return annualInterestRate;
    }
    public void setannualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate=annualInterestRate;
    }
    
    public java.util.Date getdateCreated(java.util.Date dateCreated)
    {
        return dateCreated;
    }
    
    
    
    
    public double getMonthlyInterestRate()
    {
        double MonthlyInterestRate=(annualInterestRate / 12);
        
        return MonthlyInterestRate;
    }
    
    public double withdraw(double amount) {
    return balance -= amount;
    }
    public double deposit(double amount) {
    return balance += amount;   
    }
  }
  
