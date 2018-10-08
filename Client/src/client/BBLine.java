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
public class BBLine {
    APoint begin,end;
    
    public BBLine (int x1,int y1,int x2,int y2){
        begin = new APoint(x1,y1);
        end = new APoint(x2,y2);
    }
    public BBLine(APoint begin, APoint end){
        this.begin=begin;
        this.end=end;
    }
    @Override
    public String toString(){
        return "Line[begin="+begin+",end="+end+"]";
    }
    public double getLength(){
        return begin.distance(end);
    }
}
