/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Anum
 */
public class Circle implements AShape{
    private Point centre;
    private float radius;
    
    public Circle()
    {
        setRadius(0);
    }
    
    public Circle (int x,int y, int rad)
    {
       centre = new Point(x, y);
       this.radius=rad;
    }
    
    public void setRadius (float r)
    {
        radius = (r>=0? r:0.0f);
    }
    
    public double getRadius (){
        return radius;
    }
    
    
        @Override
       public void drawOnConsole(){
           
    }
    
    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }
@Override
        public String toString(){
            return " Radius = " +radius +"\n"+ "Centre=(" + centre.getX() + ","+ centre.getY()+")"+"\n The Area of Circle is:"+this.area()+"\n The Perimeter of Circle is:"+this.perimeter();
        }
}
