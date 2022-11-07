  
    public class Fan{
    private int speed;
    private boolean on;
    private double radius;
    String color;
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;


public Fan (){
     speed = slow;
    on = false;
    radius = 5;
    color = "blue";
    
}

public void setspeed(int speed)
{
    this.speed=speed;
}

public int getspeed(){
    
    return speed;   
}

public void seton(boolean on)
{
    this.on=on;
}
public boolean geton(){
    
    return on;
}
public void setradius(double radius)
{
    this.radius=radius;
}
public double getradius(){
    
    return radius;   
}
public void setcolor(String color)
{
    this.color=color;
}
public String getcolor(){
    
    return color;   
}

public String toString()
{
    if(on==true)
    {
        return " "+speed+" "+color+" "+radius+" "+"fan is on";
       
    }
    else
    {
        return " "+color+" "+radius+" "+"fan is off";
        
    }
}
public int getslow(){
return slow;}
public int getmedium(){
return medium;}
public int getfast(){
return fast;}
}
