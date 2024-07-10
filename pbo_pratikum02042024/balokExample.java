/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_pratikum02042024;

/**
 *
 * @author LABP1KOMP
 */
import java.util.Scanner;
public class balokExample {
    public static void main(String[]args){
        int p,l,t,la;
        Scanner in = new Scanner(System.in);
        System.out.println("==Balok==");
        balok b1= new balok();
        System.out.print("Panjang = "); p = in.nextInt();
        b1.setPanjang(p);
        System.out.print("lebar = "); l = in.nextInt();
        b1.setLebar(l);
        System.out.print("Tinggi = "); t  = in.nextInt();
        b1.setTinggi(t);
        la = b1.HitungLuasAlas();
        b1.printBalok(la,b1.HitungLuasPermukaan(),b1.HitungVolume());
        
        //buat balok B2 -->Konstruktor
        System.out.println("== Balok 2 ==");
        balok b2 = new balok(10);
        b2.setLebar(4);
        b2.setTinggi(5);
        b2.printBalok();
        b2.printBalok(b2.HitungLuasAlas(),b2.HitungLuasPermukaan(),
                b2.HitungVolume(b2.HitungLuasAlas()));
        
        //buat balok b2 -->Konstruktor
        System.out.println("== Balok 3 ===");
        System.out.print("Panjang ="); p = in.nextInt();
        System.out.print("lebar ="); l = in.nextInt();
        System.out.print("Tinggi ="); t = in.nextInt();
        balok b3 = new balok(p,l,t);
        la = b3.HitungLuasAlas();
        b3.printBalok(la,b3.HitungLuasPermukaan(),b3.HitungVolume(la));
        
    }
}
