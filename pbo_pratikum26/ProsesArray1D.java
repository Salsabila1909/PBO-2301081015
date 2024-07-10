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
import java.util.Scanner;
import java.util.Random;
    public class ProsesArray1D {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            Random rand = new Random();
            int i,j,n;
            int jml,max,min;
            int imax,imin; ///indeks t4 nilai max min berada
            float rata;
            
            System.out.print("Masukkan Banyak Data: ");
            n = in.nextInt();//menjadi ukuran array
            int[] A = new int[n];//Buat array dengan ukuran n
            
            //Isi Array A
            // System.out.println("\n***Mengisi Array A***");
            for(i=0;i<=n-1;i++)
            {
            //System.out.println("Array["+i+"] = ");
                //A[i]=in.nextInt();
                A[i]=rand.nextInt(100)+1;///1-100
            }
            //Proses isi Array
            jml = A[0];
            max = A[0]; imax = A[0];
            min = A[0]; imin = A[0];
             for(i=0;i<=n-1;i++)
             {
                 jml = jml + A[i];
                 if(A[i]>max)
                 {
                     max=A[i];
                     imax = i;
                 }
                 if(A[i]<min)
                 {
                  min=A[i];
                  imin = i;
                 }
             }
             rata = (float)jml/n;
             //Menampilkan isi Array A
             System.out.println("\n***Menampilkan isi array A ***");
              for(i=0;i<n;i++)
              {
                      System.out.print(A[i]+"\t");
              }
               //Menampilkan isi Array A
             System.out.println("\n***Menampilkan isi array A Yang Ganjil***");
              for(i=0;i<n;i++)
              {
                  if(A[i]%2!=0)
                      System.out.print(A[i]+"\t");
                  //endif
              }
              //menampilkan isi array A
       System.out.println("\n***Menampilkan isi array A pada Indeks Ganjil***");
               for(i=0;i<n;i++)
               {
                   if(i%2!=0)
                      System.out.print(A[i]+"\t");
                  //endif
               }
           System.out.println("\nJumlah  = "+jml);
           System.out.println("\nRata-rata  = "+rata);
           System.out.println("\nNilai Terbesar  = "+max+" pada indeks" +imax);
           System.out.println("\nNilai Terkecil  = "+min+" pada indeks" +imin);
        }
    }
