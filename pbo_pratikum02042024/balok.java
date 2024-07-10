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
public class balok {
   private int panjang;
   private int lebar;
   private int tinggi;
   
   public balok(){
         }
   public balok(int panjang){
       this.panjang = panjang;
   }
   
   public balok(int panjang,int lebar, int tinggi){
       this.panjang = panjang;
       this.lebar = lebar;
       this.tinggi = tinggi;
   }
   
   public int getPanjang(){
       return panjang;
   }
   
   public void setPanjang(int panjang){
   this.panjang = panjang;
   }
   
   public int getLebar(){
       return lebar;
   }
   
   public void setLebar(int lebar){
       this.lebar = lebar;
   }
   
   public int getTinggi(){
       return tinggi;
   }
   
   public void setTinggi(int tinggi){
       this.tinggi = tinggi;
   }
   
   public int HitungLuasAlas(){
       return panjang * lebar;
   }
   
   public int HitungLuasPermukaan(){
       int lsPermukaan;
       lsPermukaan = 2 * (panjang*lebar)+(panjang*tinggi)+(lebar*tinggi);
       return lsPermukaan;
   }
   
   public int HitungVolume(){
       return panjang * lebar * tinggi;
   }
   
   public int HitungVolume(int la){
       return la *tinggi;
   }
   
   public void printBalok(){
       System.out.println("Panjang :" +panjang);
       System.out.println("Lebar :" +lebar);
       System.out.println("tinggi :" +tinggi);
   }
   
   public void printBalok(int la,int lp,int vol){
       System.out.println("Luas Alas =" + la);
       System.out.println("Luas Permukaan :" +lp);
       System.out.println("volume :" +vol);
   }
   
}
