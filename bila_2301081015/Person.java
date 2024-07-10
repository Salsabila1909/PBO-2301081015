/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bila_2301081015;

/**
 *
 * @author lenovo
 */
public class Person {
    protected String name;
    protected String addres;
    
    public Person(){
        System.out.println("Person Constructor");
        name= "";
        addres = " ";
    }
    
    public Person(String name, String addres){
        this.name= name;
        this.addres = addres;
    }
    
    public String getName(){
        System.out.println("Parent : getName");
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
    
    
    
}
