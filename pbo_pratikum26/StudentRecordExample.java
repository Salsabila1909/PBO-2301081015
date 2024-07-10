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
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord student1 = new  StudentRecord();
        student1.setName("Bila");
        student1.setAddres("Padang");
        student1.setAge(20);
        student1.setMathGrade(90);
        student1.setEnglishGrade(70);
        student1.setScienceGrade(80);
        
        //
        System.out.println("Nama                 : "+student1.getName());
        System.out.println("Alamat               : "+student1.getAddres());
        System.out.println("Umur                 : "+student1.getAge());
        System.out.println("Matematika           : "+student1.getMathGrade());
        System.out.println("B.Inggris            : "+student1.getEnglishGrade());
        System.out.println("Ilmu Pengetahuan     : "+student1.getScienceGrade());
        System.out.println("Rata                 : "+student1.getAverage());
        
   
        
        //Contoh pemanggilan method overload
        System.out.println("===================");
        student1.print(student1.getName());
        System.out.println("===================");
        student1.print(student1.getEnglishGrade(),student1.getMathGrade(),
                       student1.getScienceGrade());
        
        StudentRecord annaRecord = new StudentRecord("anna");
        StudentRecord AliRecord = new StudentRecord("Ali","Padang");
        StudentRecord DeniRecord = new StudentRecord(90,80,60);
        
        annaRecord.print(annaRecord.getName());
        AliRecord.print(AliRecord.getName());
        DeniRecord.print(DeniRecord.getEnglishGrade(),DeniRecord.getMathGrade(),
                DeniRecord.getScienceGrade());
        
         //Menampilkan Jumlah Siswa
        System.out.println("Banyak Siswa        : "+StudentRecord.getStudentCount());
    }
    
}
