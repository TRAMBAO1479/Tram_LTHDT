/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lthdt_b1.Chuong05.donglenh;

import com.mycompany.lthdt_b1.Chuong05.logic.FileAndDirectoryOperations;
import java.io.File;

/**
 *
 * @author OS
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
//        File[] content = fo.getDirectoryContent("E:\\NCKH");
        //System.out.println(fo.displayContent(content));
//        File[] thumuc = fo.getSubDirectories(content);
//        System.out.println("Danh sach cac thu muc con la ");
//        System.err.println(fo.displayContent(thumuc));
//        File[] taptin = fo.getFiles(content);
//        System.err.println("Danh sach cac tap tin");
//        System.err.println(fo.displayContent(taptin));
fo.getContentRecursively("E:\\NCKH");
    }
    
}
