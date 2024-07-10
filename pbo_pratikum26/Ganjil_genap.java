/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_pratikum26;

/**
 *
 * @author LABP1KOMP
 */

    /**
     * @param args the command line arguments
     */
    import java .util.Scanner;
   public class Ganjil_genap{
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat : ");
        a =input.nextInt();
        if(a%2==0)
            System.out.println(a + "Merupakan bilangan genap");
        else  ///a mod 2 = 1
            System.out.println(a + "Merupakan bilangan ganjil");
            
        
    }
  }
    

