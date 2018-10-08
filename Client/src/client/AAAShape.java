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
public interface AAAShape {
    public  abstract double volume();
    public abstract double area();
    public abstract String getName();
    public static final double pi=Math.PI;
}
