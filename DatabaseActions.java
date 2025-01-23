/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoKomputer;

/**
 *
 * @author galang finto
 */
import java.sql.SQLException; 
import java.sql.ResultSet; 

public interface DatabaseActions {
    void simpanData(String id,String nama, String harga, String jumlah) throws SQLException;
    void ubahData(String id,String nama, String harga, String jumlah) throws SQLException;
    void hapusData(String id) throws SQLException;
    ResultSet tampilData() throws SQLException;
    
}
