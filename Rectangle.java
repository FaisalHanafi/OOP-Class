public class Rectangle{
    public double width;
    public double height;
    
    public Rectangle(){
        
    }
    public Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    
    public double getArea(){
        return width*height;
    }
    
    public double getPerimeter(){
        return 2*(width*height);
    }
    
}