/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pbo_Pratikum180524;

/**
 *
 * @author lenovo
 */
import java.io.*;
public class RedFile {
    public static void main(String args[])throws IOException{
        System.out.println("Nama file yang akan dibaca?");
        String filename;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("Membaca file"+filename+"...");
        FileInputStream fis=null;
        try{
            fis = new FileInputStream(filename);
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        }
        try{
            char data;
            int temp;
            do{
                temp = fis.read();
                data = (char) temp;
                if(temp != -1){
                    System.out.print(data);
                }
            }while (temp != -1);
        }catch (IOException ex){
            System.out.println("Problem in reading from the file.");
        }
    }
}
