/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pbo_Pratikum140524;

/**
 *
 * @author lenovo
 */
public class DivByZero {
    public static void main(String args[]){
        try{
      int angka = Integer.parseInt(args[0]);
       System.out.print(3 / angka);
       System.out.print("Cetak.");
    }catch(ArrayIndexOutOfBoundsException ex){
    System.out.print(" Argumen Tidak Ada :" +ex.getMessage());
    }catch(ArithmeticException ex){
        System.out.print(" Bagi depan 0 :" +ex.getMessage());
    }finally{
            System.out.println("Block Finally Setelah Exception " );
        }
}
    
    
}
