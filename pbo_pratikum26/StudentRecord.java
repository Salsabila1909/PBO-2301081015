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
public class StudentRecord {
    String name;
    String addres;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    
    private static int studentCount;
    
    public StudentRecord(){ 
        System.out.println("StudentRecord Constructor");
        studentCount++;
    }
    public StudentRecord(String temp){
        this.name = temp;
        studentCount++;
    }
    public StudentRecord(String name, String addres){
        this.name = name;
        this.addres = addres;
        studentCount++;
    }
    
    public StudentRecord(double mGrade,double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddres(){
        return addres;
    }
    public void setAddres(String addres){
        this.addres = addres;
    }
     public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
     public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
     }
     public double getMathGrade(){
        return mathGrade;
     }
    public double getEnglishGrade(){
        return englishGrade;
    }
     public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
     public double getScienceGrade(){
        return scienceGrade;
     }
      public double getAverage(){
          average =(mathGrade + englishGrade + scienceGrade) / 3;
        return average;
     }
      public static int getStudentCount(){
          return studentCount;
      }
      public void print(String temp){
          System.out.println("Name:" +name);
          System.out.println("Addres:" +addres);
          System.out.println("Age:" +age);
      }
      public void print(double eGrade, double mGrade , double sGrade){
      System.out.println("Name : "+name);
      System.out.println("Math Grade : " + mGrade);
      System.out.println("English Grade: " + eGrade);
      System.out.println("Science Grade :" + sGrade);
    }
}
