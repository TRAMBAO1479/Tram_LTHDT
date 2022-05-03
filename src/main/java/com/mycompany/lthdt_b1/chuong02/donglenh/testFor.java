/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt_b1.chuong02.donglenh;

import java.util.Random;

/**
 *
 * @author OS
 */
public class testFor {
    public static void main(String[] args) {
        //tinh tong thu nhat
        int n= 100; 
        double s =0;
        for (int i = 1; i <= n; i++) {
        s = s + (double)1/i;
        
    }
        System.out.println("Tong thu nhat la: "+ s);
        
        //tinh tong thu 2
        n =99;
        int s2 = 0;
        for (int i = 1; i <= n; i +=2) {
            s2 = s2 + i;
            
        }
        System.out.println("Tong thu hai la: "+ s2);
        
        //sinh ngau nhien n so nguyen
        Random rnd = new Random();
        int x;
        for (int i =0 ; i< 10; i++) {
            
            x = rnd.nextInt(101);
            System.out.println(x);
        }
    }
}
