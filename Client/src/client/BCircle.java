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
public class BCircle extends APoint{
    protected double radius;
    public BCircle(){
        setRadius(0);
    }
    public BCircle (double r,int a,int b){
        super (a,b);
        setRadius(r);
    }
    public void setRadius(double r){
        radius=(r>=0?r :0.0);
    }
    public double getRadius(){
        return radius;
}
    @Override
    public double area(){
        return pi*radius*radius;
    }
    @Override
    public String toString(){
        return " Radius="+radius+"\n"+"x="+x+",y="+y;
    }
    @Override
    public String getName(){
        return "Circle";
    }
}
