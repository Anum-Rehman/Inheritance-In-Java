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
public class APoint implements AAAShape{
    protected int x,y;
    public APoint(){
        setAPoint(0,0);
    }
    public APoint(int a,int b){
        setAPoint(a,b);
    }
    public void setAPoint(int a,int b){
        x=a; y=b;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String toString(){
        return "["+x+","+y+"]";
    }
    public double area(){
        return 0.0;}
    public double volume(){
        return 0.0;
    }
    public String getName(){
        return "Point";
    }

    double distance(APoint end) {
        double distance = Math.sqrt(x+y);
        return distance;
    }
    }
    
    
    
    


