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
public class Shape {
    private String ShapeName;
    private double height;
    private double width;
    private double breadth;
    public Shape(String ShapeName,double height,double width,double breadth){
        this.ShapeName=ShapeName;
        this.height=height;
        this.breadth=breadth;
        this.width=width;
    }
        public String getShapeName(){
        return ShapeName;
    }
    public void setShapeName(String ShapeName){
        this.ShapeName=ShapeName;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    
        public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setBreadth(double breadth){
        this.breadth=breadth;
    }
    @Override
    public String toString(){
        return "Shape Name:"+this.ShapeName+"\t"+"Height:"+this.height+"\t"+"Width:"+this.width+"\t"+"Breadth:"+this.breadth;
    }
}
