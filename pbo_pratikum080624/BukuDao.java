/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pratikum080624;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lenovo
 */
public class BukuDao {
    private List <Buku> data = new ArrayList();

    public BukuDao() {
      data.add(new Buku("A001","katanya cemara","Vania Winola","Salsabila","2023"));
      data.add(new Buku("A002","Langit","Tereliye","Yoga","2022"));
    }
    
    public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index,Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List <Buku> getAll(){
        return data;
    }
    
    
}
