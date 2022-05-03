/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lthdt_b1.chuong03.donglenh;

import com.mycompany.lthdt_b1.chuong03.coffeelogic.CoffeeShop;
import com.mycompany.lthdt_b1.chuong03.coffeelogic.Manager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author OS
 */
public class testCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        CoffeeShop[] a = new CoffeeShop[]{new CoffeeShop("Kha Coffee", "2 Nguyen Hue"),
                                          new CoffeeShop("White garden", "4 Nguyen Hue"),
                                          new CoffeeShop("Hoang Truc Vien", "3 Nguyen Hue")};
    Manager[] managers = new Manager[]{
                        new Manager(a, 1000, "Le Thi A", 0, df.parse("12-12-1999")),
                        new Manager(new CoffeeShop[]{
                                                new CoffeeShop("Hoang Hac", "12 Nguyen Hue")
                        }, 
                                2000, "Ngyen Van B", 1, df.parse("12-12-2000"))
                        
    };
        System.out.println(Arrays.toString(managers));
    }
    
}
