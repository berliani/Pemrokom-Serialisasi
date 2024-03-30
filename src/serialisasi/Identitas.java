/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Berliani Risqi
 */
public class Identitas implements Serializable {
    
 private transient String id; //menggunakan transient agar tidak diikutkan dalam proses serialisasi
 private static String nama;
 private String namaibu;
 private String tempatlahir;
 private List<ProductItem> items;
 public void setId(String id) {
    this.id = id;
 }
 public void setNama(String nama) {
    this.nama = nama;
 }
 public void setItems(List<ProductItem> items) {
    this.items = items;
 }
 public void setNamaIbu(String namaIbu) {
     this.namaibu = namaibu;
 }
 public void setTempatLahir(String tempatLahir) {
     this.tempatlahir = tempatlahir;
 }
 @Override
 public String toString() {
    String identitas, item = "";
    identitas = """
             Identitas: \r
             Id=""" + id + "\r\n"
        + "Nama=" + nama + "\r\n"
        + "=======================\r\n"
        + "Identitas:\r\n";
    item = items.stream().map((obj) ->
obj.toString()).reduce(item, String::concat);
     return identitas + item;
 }
}

