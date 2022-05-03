/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt_b1.donglenh.chuong1.chuong01;

/**
 *
 * @author OS
 */
public class circle extends Shape{
    private int radius;
    private int x , y;

    public circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public circle() {
    }
    
    @Override
    public double calcPerimeter(){
       double result = 2*Math.PI*this.radius;
       return result;
    
    }
    @Override
    public double calcArea() {
        
        double result = Math.PI*this.radius*this.radius;
        return result;
    }

    @Override
    public String toString() {
        String output = "chu vi hinh tron la: " + calcPerimeter() +
                "; Dien tich la: " + calcArea();
        return output;
    }
    
    

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
