/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pbo_Pratikum140524;

/**
 *
 * @author lenovo
 */
public class ThrowDemo {
    public static void main(String[] args){
        String input = "invalid input";
        try{
            if(input.equals("invalid input")){
                throw new MyException("invalid");
            }else{
                System.out.println(input);
            }
                
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
