/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt_b1.Chuong05.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author OS
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    //Thao tac 1: liet ke tat ca cac thu muc va tap tin trong thu muc hien tai
    public File[] getDirectoryContent(String folder) {
       File directory = new File(folder);
       if (directory.isFile())
           return  null;
       File[] results = directory.listFiles();
       return results;

    }
    //Thao tac 2: xuat ket qua
    public String displayContent (File[] content){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < content.length; i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    //Thao tac 3: Loc ra cac thu muc
    public File[] getSubDirectories (File[] content) {
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++) {
            if (content[i].isDirectory()){
            result.add(content[i]);
        }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);       
                }
    
    //Thao tac 4: loc ra tat ca cac tap tin
    public File[] getFiles(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++) {
            if (content[i].isFile()){
            result.add(content[i]);
        }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);       
                }       
    // Thoa tac 5: Duyet de quy xuat tat ca cac tap tin va thu muc
    public void getContentRecursively (String folder){
        File content = new File(folder);
            //Dieu kien dung
            if (content.isFile()){
                System.out.println(content.getPath() + File.separator + content.getName());
                return;
            }
            
            //Cau goi de quy trong stack
            System.out.println("Thu muc: " + folder);
            File[] sub = content.listFiles();
            for (int i = 0; i < sub.length; i++){
                getContentRecursively(folder + File.separator + sub[i].getName());
            }       
    }
    
    // Thoa tac 6: doc file van ban
    public String readTextFile(String filename) {
        FileReader fr = null;
        try {
            StringBuilder content = new StringBuilder();
            //mo file
            fr = new FileReader(filename);
            //dung bo dem
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            while ((line = br.readLine()) != null){
                content.append(line);
                content.append("\n");
            }
            
            //Dong file
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            return  "Khong tim thay fie " +filename;
        } catch (IOException ex) {
            return "Khong the doc file " + filename;
        }
        
        return content.toString();
//        } finally {
//            try {
//                fr.close();
//            } catch (IOException ex) {
//                Logger.getLogger(FileAndDirectoryOperations.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }
    
    //Thao tac 7: luu tap tin van ban
    public  boolean  writeTextFile(String filename, String content){
        boolean flag = true; //luu thanh cong
        try {
            //mo file
            FileWriter fw = new FileWriter(filename);
            //su dung buffer
            BufferedWriter bw = new BufferedWriter(fw);
            //ghi ra file
            bw.write(content);
            //dong file
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            return false;
        }
        return flag;
        
    }
}
