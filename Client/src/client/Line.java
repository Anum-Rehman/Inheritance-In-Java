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
public class Line implements AShape{
private Point Begin,End;
      
    public Line(int x1, int y1, int x2, int y2){
        Begin = new Point(x1,y1);
        End = new Point(x2, y2);
    }   
    
    public Line(Point Begin, Point End){
        this.Begin = Begin;
        this.End = End;
    }
    
    
    public Point getBegin(){
        return Begin;
    }
    
    public void setBegin(Point Begin){
        this.Begin = Begin;
    }
    
    public Point getEnd(){
        return End;
    }
    
    public void setEndPoint(Point EndPoint){
        this.End = End;
    }
    
    @Override
    public String toString(){
        return "The two points of a Line are:\n Begin Point"+this.Begin+ "\n End Point="+this.End;
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
