import java.util.Date;
public class TestAccount{
    public static void main(String args[])
    {
        java.util.Date d2 = new java.util.Date();
        
        Account ac1 = new Account(1122, 20000 ,4.5);
        
        java.util.Date dateCreated = new java.util.Date();
        System.out.println("Date Created:" + dateCreated);
        
        System.out.println("Account ID:" + ac1.getid());
        System.out.println("Balance:" + ac1.getbalance());
        System.out.println("Interest Rate:" + ac1.getannualInterestRate());
        
        ac1.withdraw(2500);
        System.out.println("Balance after withdraw of 2500:" +ac1.getbalance());
        ac1.deposit(3000);
        System.out.println("Balance after deposit of 3000:" + ac1.getbalance());
        
        
        
        
        
        System.out.println("Monthly Interest :" + ((ac1.getannualInterestRate()/100)*ac1.getbalance()));

}
    }
