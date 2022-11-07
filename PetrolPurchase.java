public class PetrolPurchase{
    private String location;
    private String petroltype;
    private int quantity;
    private double liter;
    private double discount_percent;
    
    public PetrolPurchase(){
    }
    public PetrolPurchase(String location,String petroltype,int quantity,double liter,double discount_percent)
    {
        this.location=location;
        this.petroltype=petroltype;
        this.quantity=quantity;
        this.liter=liter;
        this.discount_percent=discount_percent;
    }
    public String getlocation()
    {
        return location;
    }
    public String getpetroltype()
    {
        return petroltype;
    }
    public int getquantity()
    {
        return quantity;
    }
    public double getliter()
    {
        return liter;
    }
    public double getdiscount_percent()
    {
        return discount_percent;
    }
    public void setlocation(String location)
    {
        this.location=location;
    }
    public void setpetroltype(String petroltype)
    {
        this.petroltype=petroltype;
    }
    public void setquantity(int quantity)
    {
        this.quantity=quantity;
    }
    public void setliter(double liter)
    {
        this.liter=liter;
    }
    public void setdiscount_percent(double discount_percent)
    {
        this.discount_percent=discount_percent;
    }
    public double getPurchase_Amount()
    {
        double Purchase_Amount=(liter*quantity);
        return Purchase_Amount= Purchase_Amount -(Purchase_Amount*(discount_percent/100));
    }
}