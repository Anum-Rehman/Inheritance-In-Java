 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Anum
 */
public class ShapeCatalogue implements AShape{
    Shape[] myShapeList;
    int ObjectCounter;
    public ShapeCatalogue(){
        myShapeList = new Shape[2];
        ObjectCounter=0;
    }
 
    public void addShape(String ShapeName,double height,double width,double breadth){
     if (ObjectCounter==myShapeList.length)
         increaseSize();
     myShapeList[this.ObjectCounter]=new Shape(ShapeName,height,width,breadth);
     this.ObjectCounter++;
    }
    public void increaseSize(){
        Shape[] tempReference=new Shape [this.myShapeList.length*2];
        for (int c=0;c<this.ObjectCounter;c++){
            tempReference [c]=myShapeList[c];
    }
        this.myShapeList=tempReference;
    }
        @Override
    public String toString(){
        String result="\n~~~~~~~~~~~~~~~~~~~~~Shape List~~~~~~~~~~~~~~~~~~~~~~~~\n\n";
        result +="Total Shapes:"+this.ObjectCounter+"\n\n";
        for (int i=0;i<this.ObjectCounter;i++)
            result +=myShapeList[i].toString()+"\n";
        return result;
    }
    public boolean removeShape(String ShapeName,double height,double width,double breadth){
        
        int loc=this.find(ShapeName,height, width, breadth);
        if (loc== -1){
             System.out.println("Shape not found");
             return false;
         }
         else{
         for (int i=loc+1;i<this.ObjectCounter;i++){
             ShapeName=this.myShapeList[i].getShapeName();
             this.myShapeList[loc-1].setShapeName(ShapeName);
             height=this.myShapeList[i].getHeight();
             this.myShapeList[loc-1].setHeight(height);
             width=this.myShapeList[i].getWidth();
             this.myShapeList[loc-1].setWidth(width);
             breadth=this.myShapeList[i].getBreadth();
             this.myShapeList[loc-1].setBreadth(breadth);
             
         }
         this.myShapeList[ObjectCounter-1]=null;
         ObjectCounter--;
    }
        return true;
    }
    public int find(String ShapeName,double height,double width,double breadth){
        for (int a=0;a<ObjectCounter;a++)
            if (myShapeList[a].getShapeName().equals(ShapeName) && myShapeList[a].getHeight()==height && myShapeList[a].getWidth()==width && myShapeList[a].getBreadth()==breadth)
        return 1;
        return -1;
    }
        public ShapeCatalogue sort(Shape[] myShapeList,String usercriteria){
        Shape[] tempoutput =new Shape[myShapeList.length];
        switch (usercriteria){
            case "ShapeName":
            
                    String[] nameArray=new String [ObjectCounter];
                   for (int i=0; i<ObjectCounter;i++){
                       nameArray[i]=myShapeList[i].getShapeName();
                }
                Arrays.sort(nameArray);
                   for (int i=0;i<this.ObjectCounter;i++){
                       int Idx=this.findShape(nameArray[i]);
                       tempoutput[i]=new Shape (myShapeList[Idx].getShapeName(),myShapeList[Idx].getHeight(),myShapeList[Idx].getWidth(),myShapeList[Idx].getBreadth());
                   }
                   break;
            case "Height":
            
                    double[] heightArray=new double [ObjectCounter];
                   for (int i=0; i<ObjectCounter;i++){
                       heightArray[i]=myShapeList[i].getHeight();
                }
                Arrays.sort(heightArray);
                   for (int i=0;i<this.ObjectCounter;i++){
                       int Idx=this.findShape(heightArray[i]);
                       tempoutput[i]=new Shape (myShapeList[Idx].getShapeName(),myShapeList[Idx].getHeight(),myShapeList[Idx].getWidth(),myShapeList[Idx].getBreadth());
                   }
                   break;
            case "Width":
            
                    double[] widthArray=new double [ObjectCounter];
                   for (int i=0; i<ObjectCounter;i++){
                       widthArray[i]=myShapeList[i].getWidth();
                }
                Arrays.sort(widthArray);
                   for (int i=0;i<this.ObjectCounter;i++){
                       int Idx=this.findShape1(widthArray[i]);
                       tempoutput[i]=new Shape (myShapeList[Idx].getShapeName(),myShapeList[Idx].getHeight(),myShapeList[Idx].getWidth(),myShapeList[Idx].getBreadth());
                   }
                   break;
                   case "Breadth":
            
                    double[] BreadthArray=new double [ObjectCounter];
                   for (int i=0; i<ObjectCounter;i++){
                       BreadthArray[i]=myShapeList[i].getWidth();
                }
                Arrays.sort(BreadthArray);
                   for (int i=0;i<this.ObjectCounter;i++){
                       int Idx=this.findShape1(BreadthArray[i]);
                       tempoutput[i]=new Shape (myShapeList[Idx].getShapeName(),myShapeList[Idx].getHeight(),myShapeList[Idx].getWidth(),myShapeList[Idx].getBreadth());
                   }
                   break;
        }
        ShapeCatalogue outL =new ShapeCatalogue();
            outL.myShapeList=tempoutput;
            outL.ObjectCounter=tempoutput.length;
            return outL;
        }
        public Shape search(Shape[] sList,String userchoice){
                Shape[] tempoutput =new Shape[myShapeList.length];
            switch (userchoice){
                case "ShapeName,Height":{
                    System.out.println("Enter the Shape name & Height of the Shape you want to search");
                    System.out.println("Shape Name");
                    Scanner sc=new Scanner(System.in);
                    String line=sc.nextLine();
                    System.out.println("Shape Height");
                    double a=sc.nextFloat();
                    int ind = this.findShapeA(line,a);
                if (ind == -1)
                {
                    System.out.println("Shape not found");   
                }
                
                else
                {
                    for (int i=ind+1; i<ObjectCounter; i++){
                    Shape TempShape = new Shape(this.myShapeList[ind].getShapeName(),
                                                              this.myShapeList[ind].getHeight(),
                                                              this.myShapeList[ind].getBreadth(),
                                                              this.myShapeList[ind].getWidth());
                    return TempShape;
                    }
                    break;
                }
                }
                case "ShapeName,Width":{
                    System.out.println("Enter the Shape name & Height of the Shape you want to search");
                    System.out.println("Shape Name");
                    Scanner sc=new Scanner(System.in);
                    String line=sc.nextLine();
                    System.out.println("Shape Width");
                    double a=sc.nextFloat();
                    int ind = this.findShapeB(line,a);
                if (ind == -1)
                {
                    System.out.println("Student not found");   
                }
                
                else
                    //for (int i=ind+1; i<ObjectCounter; i++)
                {
                    Shape TempShape = new Shape(this.myShapeList[ind].getShapeName(),
                                                              this.myShapeList[ind].getHeight(),
                                                              this.myShapeList[ind].getBreadth(),
                                                              this.myShapeList[ind].getWidth());
                    return TempShape;
                }
                break; }
                case "ShapeName,Breadth":{
                    System.out.println("Enter the Shape name & Height of the Shape you want to search");
                    System.out.println("Shape Name");
                    Scanner sc=new Scanner(System.in);
                    String line=sc.nextLine();
                    System.out.println("Shape Breadth");
                    double a=sc.nextFloat();
                    int ind = this.findShapeC(line,a);
                if (ind == -1)
                {
                    System.out.println("Student not found");   
                }
                
                else
                    //for (int i=ind+1; i<ObjectCounter; i++)
                {
                    Shape TempShape = new Shape(this.myShapeList[ind].getShapeName(),
                                                              this.myShapeList[ind].getHeight(),
                                                              this.myShapeList[ind].getBreadth(),
                                                              this.myShapeList[ind].getWidth());
                    return TempShape;
                }
                break; }
            }
              return null;  
            }
        
        public int findShapeA(String ShapeName,double height){
                       for (int i=0;i<ObjectCounter;i++){
                           if (myShapeList[i].getShapeName().equals(ShapeName)&& myShapeList[i].getHeight()==height)
                            return i;   
                       }
                       return -1;
                   }
        public int findShapeB(String ShapeName,double width){
                       for (int i=0;i<ObjectCounter;i++){
                           if (myShapeList[i].getShapeName().equals(ShapeName)&& myShapeList[i].getWidth()==(width))
                            return i;   
                       }
                       return -1;
                   }
        public int findShapeC(String ShapeName,double breadth){
                       for (int i=0;i<ObjectCounter;i++){
                           if (myShapeList[i].getShapeName().equals(ShapeName)&& myShapeList[i].getBreadth()==breadth)
                            return i;   
                       }
                       return -1;
                   }
        private int findShape(String nameArray){
                   for (int i=0;i<ObjectCounter;i++)
                       if (myShapeList[i].getShapeName().equals(nameArray))
                       return i; 
                   
                   return -1;
        }
        private int findShape(double heightArray){
                   for (int i=0;i<ObjectCounter;i++)
                       if (myShapeList[i].getHeight()==(heightArray))
                       return i; 
                   
                   return -1;
        }
        private int findShape1(double widthArray){
                   for (int i=0;i<ObjectCounter;i++)
                       if (myShapeList[i].getWidth()==widthArray)
                       return i; 
                   
                   return -1;
        }
        private int findShape2(double breadthArray){
                   for (int i=0;i<ObjectCounter;i++)
                       if (myShapeList[i].getBreadth()==breadthArray)
                       return i; 
                   
                   return -1;
        }
        
    @Override
    public void drawOnConsole() {
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
