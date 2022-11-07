
public class Petrol{
    public static void main(String args[])
    {
        PetrolPurchase pp1 = new PetrolPurchase("Petron Gombak","Ron 97",33,2.35,10);
        
        System.out.println("The location is: " +pp1.getlocation());
        System.out.println("The type of petrol is: " +pp1.getpetroltype());
        System.out.println("The quantity of petrol purchased is: "+pp1.getquantity());
        System.out.println("The price per liter is: RM "+pp1.getliter());
        System.out.println("The amount of discount is "+pp1.getdiscount_percent()+"%.");
        System.out.println("The total charges is: RM"+pp1.getPurchase_Amount());
        
        
    }
}