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
public class CCSphere extends BCircle{
    protected int z;
    public CCSphere (double r, int a, int b, int c){
        super (r,a,b);
        z=c;
    }
    public int getZ(){
        return z;
    }
    public double area(){
        return 4*super.area();
    }
    public double volume(){
        return (4.0/3)*super.area()*radius;    }
    @Override
    public String toString(){
        return super.toString()+",z="+z;
} 
    public String getName(){
        return "Sphere";
    }
}
