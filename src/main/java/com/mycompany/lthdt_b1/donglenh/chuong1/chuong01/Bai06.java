/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt_b1.donglenh.chuong1.chuong01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author OS
 */
public class Bai06 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "04-04-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Nguyen Van A", 1, ngaysinh);
        
        System.out.println("Ho ten: " +person.getHoten()+ "; gioi tinh: "
                    + person.getGioitinh() + "; ngay sinh: " + 
                df.format(person.getNgaysinh()));
        
        Student sinhvien= new Student();
        sinhvien.setHoten("Nguyen Van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("26-02-2001"));
        sinhvien.setTruonghoc("Dai hoc Hue");
        System.out.println(sinhvien.getHoten()+"; Gioi tinh " +
                sinhvien.getGioitinh()+ "; Ngay sinh " +
                df.format(sinhvien.getNgaysinh()) +"; "+
                sinhvien.getTruonghoc());
        System.out.println(sinhvien.calcTax(1200));
        
        
        Worker congnhan= new Worker();
        congnhan.setHoten("Nguyen Thi C");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("21-12-1995"));
        congnhan.setCongty("IBM");
        System.out.println(congnhan.getHoten() +"; Gioi tinh: " +
                congnhan.getGioitinh() +" Ngay sinh: " +
                df.format(congnhan.getNgaysinh()) + "; cong ty: " +
                congnhan.getCongty());
        System.out.println(congnhan.calcTax(2000));
    }
}
