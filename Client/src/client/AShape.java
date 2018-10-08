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
public interface AShape {
    public abstract void drawOnConsole();
    public abstract double area();
    public abstract double perimeter();
    public static final double pi=Math.PI;
}
