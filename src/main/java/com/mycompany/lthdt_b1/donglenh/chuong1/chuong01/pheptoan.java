/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt_b1.donglenh.chuong1.chuong01;

/**
 *
 * @author OS
 */
public class pheptoan {
    public static void main(String[] args) {
        //        //các phép toán với số nguyên
        int a = 17, b = 4, c;
        c = a + b;
        System.out.println("Phep cong " + a + " + " + b + " = " + c);
      c = b - a;
       System.out.println("Phep tru " + b + " - " + a + " = " + c);
      c = a*b;
       System.out.println("Phep nhan " + a + " * " + b + " = " + c);
      c = a/b;
     System.out.println("Phep chia lay phan nguyen " + a + " / " + b + " = " + c);
 c = a%b;
  System.out.println("Phep chia lay phan du " + a + " % " + b + " = " + c);
  
  
  //các phép toán với số thực
   double x = 14.3, y = 3.56, z ;
   z = x + y;
   System.out.println("Phep cong " + x + " + " + y + " = " + z );
  z = y - x;
    System.out.println("Phep tru " + y + " - " + x + " = " + z );
  z = y*x;
    System.out.println("Phep nhan " + x + " * " + y + " = " + z );
  z=y/x;
    System.out.println("Phep chia " + y + " / " + x + " = " + z );
   
  // các phép toán trên kiểu logic
  boolean flag1 = true, flag2 = false, flag3 = true;
  System.out.println("Phep AND " + (flag1 && flag2));
 System.out.println("Phep OR " + (flag1 || flag2));
  System.out.println("Phep NOT " + (!flag1));
  System.out.println("Phep XOR " + (flag1 ^ flag3));
//Một số phép toán cơ bản trên chuỗi
 String s1 = "Hue university";
 String s2 = "universicy";
 
 System.out.println(s1.toLowerCase());
 System.out.println(s2.toUpperCase());
 System.out.println(s1.toLowerCase().contains(s2));
 s1 +=" " + s2;
 System.out.println(s1);
    }
}
