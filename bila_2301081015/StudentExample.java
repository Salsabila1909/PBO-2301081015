/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bila_2301081015;

/**
 *
 * @author lenovo
 */
public class StudentExample {
    public static void printInformation(Person p){
        if(p instanceof Student){
            System.out.println("Nama Siswa :"+p.getName());
            System.out.println("Alamat :"+p.getAddres());
        }
         if(p instanceof Employee){
            System.out.println("Nama karyawan :"+p.getName());
            System.out.println("Alamat :"+p.getAddres());
        }
    }
    public static void main(String[]args){
      //  Person ref;
    Student ali = new Student();
    ali.setName("Ali");
    ali.setAddres("Padang");
    Employee budi = new Employee();
    budi.setName("Budi");
    budi.setAddres("Bukit tinggi");
    
    printInformation(ali);
    printInformation(budi);
    
    //ref = ali;
    //System.out.println("Nama   :"+ ref.getName());
    //System.out.println("Alamat   :"+ ref.getAddres());
    
     //ref = budi;
    //System.out.println("Nama Karyawan   :"+ ref.getName());
    //System.out.println("Alamat   :"+ ref.getAddres());
    
    }
}
