/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.Scanner;


/**
 *
 * @author Anum
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ShapeCatalogue myShape=new ShapeCatalogue();
        try (Scanner sc=new Scanner(System.in)){
        
        final int mainmenuselection=askuserforchoice(sc,"1-Add Shape,2-Remove Shape,3-Sort Shape,4-Find Shape",4);
        switch (mainmenuselection){
            case 1:{
                System.out.println("How many Shapes you want to add??");
                int a=sc.nextInt();
                sc.nextLine();
                for (int c=0;c<a;c++){
                System.out.println("Enter Shape attributes:ShapeName \t height \t width \t breadth");
                String line=sc.nextLine();
                String[] split=line.split(" ");
                myShape.addShape(split[0],Double.parseDouble(split[1]),Double.parseDouble(split[2]),Double.parseDouble(split[3]));}
                System.out.println("Input successful and shown below");
                System.out.println(myShape);
                Point point =new Point(5,6);
                Circle circle=new Circle(2,4,5);
                Line myline=new Line(2,3,5,6);
                
                AShape arrayofshape[]=new AShape[3];
                arrayofshape[0]=point;
                arrayofshape[1]=circle;
                arrayofshape[2]=myline;
                
                System.out.println("The other 3 Shapes are:\n");
                System.out.println("\n\n~~~~~~~~~~~~~~~~Point~~~~~~~~~~~~~~~~~\n\n"+point.toString());
                System.out.println("\n\n~~~~~~~~~~~~~~Line~~~~~~~~~~~~~~~~\n\n"+myline.toString());
                System.out.println("\n\n~~~~~~~~~~~~~~~~~Circle~~~~~~~~~~~~~~~\n\n"+circle.toString());
                break;
            }
            case 2:{
                System.out.println("How many Shapes you want to add??");
                int c=sc.nextInt();
                sc.nextLine();
                for (int a=0;a<c;a++){
                System.out.println("Enter Shape attributes:ShapeName \t height \t width \t breadth");
                String line=sc.nextLine();
                String[] split=line.split(" ");
                myShape.addShape(split[0],Double.parseDouble(split[1]),Double.parseDouble(split[2]),Double.parseDouble(split[3]));}
                System.out.println("Input successful and shown below");
                System.out.println(myShape);
                System.out.println("Enter the Shape info you want to remove");
                System.out.print("Shape Name: ");
                String a=sc.nextLine();
                System.out.print("Height: ");
                double d=sc.nextDouble();
                System.out.print("width: ");
                double e=sc.nextDouble();
                System.out.print("Breadth: ");
                double f=sc.nextDouble();
                boolean k=myShape.removeShape(a, d, e, f);
                if(k==k){
                    System.out.println(k);
                    System.out.println("\n\n Shape Deleted");
                }
                else{
                    System.out.println("Shape is not in current List");
                }
                System.out.println(k);
                System.out.println(myShape);
                
                Point point =new Point(5,6);
                Circle circle=new Circle(2,4,5);
                Line myline=new Line(2,3,5,6);
                
                AShape arrayofshape[]=new AShape[3];
                arrayofshape[0]=point;
                arrayofshape[1]=circle;
                arrayofshape[2]=myline;
                
                System.out.println("The other 3 Shapes are:\n");
                System.out.println("\n\n~~~~~~~~~~~~~~~~Point~~~~~~~~~~~~~~~~~\n\n"+point.toString());
                System.out.println("\n\n~~~~~~~~~~~~~~Line~~~~~~~~~~~~~~~~\n\n"+myline.toString());
                System.out.println("\n\n~~~~~~~~~~~~~~~~~Circle~~~~~~~~~~~~~~~\n\n"+circle.toString());
                break;
            }
            case 3:{
        System.out.println("How many Shapes you want to add??");
                int c=sc.nextInt();
                sc.nextLine();
                for (int a=0;a<c;a++){
                System.out.println("Enter Shape attributes:ShapeName \t height \t width \t breadth");
                String line=sc.nextLine();
                String[] split=line.split(" ");
                myShape.addShape(split[0],Double.parseDouble(split[1]),Double.parseDouble(split[2]),Double.parseDouble(split[3]));}
                System.out.println("Input successful and shown below");
                System.out.println(myShape);
                System.out.println("Enter Criteria to sort: \t ShapeName \t Height \t Width \t Breadth");
                String line =sc.nextLine();
                String[] split=line.split(" ");
                ShapeCatalogue e=myShape.sort(myShape.myShapeList, split[0]);
                System.out.println(e);
           
                Point point =new Point(5,6);
                Circle circle=new Circle(2,4,5);
                Line myline=new Line(2,3,5,6);
                
                AShape arrayofshape[]=new AShape[3];
                arrayofshape[0]=point;
                arrayofshape[1]=circle;
                arrayofshape[2]=myline;
                
                System.out.println("\n\n The other 3 Shapes are:");
                System.out.println("\n~~~~~~~~~~~~~~~~Point~~~~~~~~~~~~~~~~~\n\n"+point.toString());
                System.out.println("\n\n~~~~~~~~~~~~~~Line~~~~~~~~~~~~~~~~\n\n"+myline.toString());
                System.out.println("\n\n~~~~~~~~~~~~~~~~~Circle~~~~~~~~~~~~~~~\n\n"+circle.toString());
           break;
        }
            case 4:{
        System.out.println("How many Shapes you want to add??");
                int c=sc.nextInt();
                sc.nextLine();
                for (int a=0;a<c;a++){
                System.out.println("Enter Shape attributes:ShapeName \t height \t width \t breadth");
                String line=sc.nextLine();
                String[] split=line.split(" ");
                myShape.addShape(split[0],Double.parseDouble(split[1]),Double.parseDouble(split[2]),Double.parseDouble(split[3]));}
                System.out.println("Input successful and shown below");
                System.out.println(myShape);
                System.out.println("Enter Criteria to Search: \t ShapeName,Height \t ShapeName,Width \t ShapeName,Breadth");
                String line =sc.nextLine();
                String[] split=line.split(" ");
                Shape e=myShape.search(myShape.myShapeList, split[0]);
                System.out.println(e);
                
                Point point =new Point(5,6);
                Circle circle=new Circle(2,4,5);
                Line myline=new Line(2,3,5,6);
                
                AShape arrayofshape[]=new AShape[3];
                arrayofshape[0]=point;
                arrayofshape[1]=circle;
                arrayofshape[2]=myline;
                
                System.out.println("\n\n The other 3 Shapes are:");
                System.out.println("\n~~~~~~~~~~~~~~~~Point~~~~~~~~~~~~~~~~~\n\n"+point.toString());
                System.out.println("\n\n~~~~~~~~~~~~~~Line~~~~~~~~~~~~~~~~\n\n"+myline.toString());
                System.out.println("\n\n~~~~~~~~~~~~~~~~~Circle~~~~~~~~~~~~~~~\n\n"+circle.toString());
           break;
        }
        }
        
        
        
}
    }
    private static int askuserforchoice(Scanner sc, String prompt, int maxvalue) {
        System.out.println("Please select menu item");
        System.out.println(prompt);
        int value=sc.nextInt();
        while(value<1 || value>maxvalue){
            
                System.out.println("Invalid menu item please try again");
        value=sc.nextInt();
        }
        return value;
}
    }
    

