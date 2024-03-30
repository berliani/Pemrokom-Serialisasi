/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;
/**
 *
 * @author Berliani Risqi
 */
public class ProductItem implements Serializable{
    String nama;
    String tempat_lahir;
    String nama_ibu;
    
    public ProductItem(String name, String place, String mother){
    this.nama = name;
    this.tempat_lahir = place;
    this.nama_ibu = mother;
}
    @Override
    public String toString(){
        return "\r\nNama" + nama + "\r\nTempat Lahir" + tempat_lahir +"\r\nNama Ibu" + nama_ibu;
    }
}
