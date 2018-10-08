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
public class Point implements AShape{
    private int x;
    private int y;
    public Point(){
        this.x=x;
        this.y=y;
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

        
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    @Override
    public String toString(){
    return "Point:(x,y)=("+x+","+y+")";
}

    @Override
    public void drawOnConsole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double area() {
        return 0.0;
    }

    @Override
    public double perimeter() {
        return 0.0;
    }
    
          
}
