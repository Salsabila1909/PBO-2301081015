/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bila_2301081015;

/**
 *
 * @author lenovo
 */
public class Student extends Person{
    public Student(){
        super();
       // super("Ali","Padang");
       super.name = "Ali";
       super.addres = "Padang";
       
        System.out.println("Student Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student : getName");
        return name;
    }
}
