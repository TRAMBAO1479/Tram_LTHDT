/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt_b1.chuong02.donglenh;

import com.mycompany.lthdt_b1.chuong02.employeelogic.Student1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author OS
 */
public class testStudent {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input ="12-12-1999";
        Date ngaysinh = df.parse(input);
        Student1 obj = new Student1("Dai hoc Hue", "Xuat sac", "Nguyen Van A", 1, ngaysinh);
//        Student1 obj = new Student1(" Dai hoc Hue",
//                                    "Xuat sac", 0, "Nguyen Van A", 1, ngaysinh);
        switch (obj.getHocluc()) {
            case "Xuat sac":
                obj.setHocbong(1000);
                break;
            case "Gioi":
                obj.getHocbong(855.5);
                break;
                default:
                    obj.getHocbong(0);
                    break;
                    
        }


        System.out.println(obj);
    }
}
