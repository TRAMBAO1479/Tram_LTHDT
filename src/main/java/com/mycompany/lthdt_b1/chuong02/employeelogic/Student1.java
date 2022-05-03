/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt_b1.chuong02.employeelogic;

import java.util.Date;

/**
 *
 * @author OS
 */
public class Student1 extends Person implements TaxInterface{
    private String truonghoc;
    private String hocluc;
    private double hocbong;

    public Student1() {
    }

    public Student1(String truonghoc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
    }

    public Student1(String truonghoc, String hocluc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
        this.hocluc = hocluc;
       // this.hocbong = hocbong;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public double getHocbong() {
        return hocbong;
    }

//    public Student(String dai_hoc_Hue, String xuat_sac, int i, String nguyen_Van_A, int i0, Date ngaysinh) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    public void setHocbong(double hocbong) {
        this.hocbong = hocbong;
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcTax(double income) {
      double tax;
       tax = 0.01*income;
       return tax;
    }

    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua += "Student{" + "truonghoc= " + truonghoc + ", hocluc= " + hocluc + ", hocbong= " + hocbong + '}';
        return ketqua;
    }

    public void getHocbong(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
