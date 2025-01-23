/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoKomputer;

/**
 *
 * @author galang finto
 */
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.Statement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 

public class CRUD extends AbstractCRUD implements DatabaseActions {
    private String id, nama, jumlah, harga; 
	 private Connection CRUDkoneksi; 
	 private PreparedStatement CRUDpsmt; 
	 private Statement CRUDstat; 
	 private ResultSet CRUDhasil;
	 private String CRUDquery; 
 
 public CRUD(){ 
 try { 
        Koneksi connection = new Koneksi(); 
        CRUDkoneksi = connection.getKoneksi(); 
        }
 catch(SQLException ex){ 
            System.out.println(ex);
        } 
 }

 @Override
 public void setID(String id) 
 { 
 this.id = id; 
 }

@Override
 public String getID() 
 { 
 return id; 
 }

@Override
 public void setNama(String nama)
 {
 this.nama = nama; 
 }

@Override
 public String getNama() 
 { 
 return nama; 
 }

@Override
 public void setHarga(String harga) 
 { 
 this.harga = harga; 
 }

@Override
 public String getHarga() 
 { 
 return harga; 
 }
 
 @Override
 public void setJumlah(String jumlah) 
 { 
 this.jumlah = jumlah; 
 }

@Override
 public String getJumlah() 
 { 
 return jumlah; 
 }

@Override
 public ResultSet tampilData() 
 { CRUDquery = "select * from tokokomputer"; 
 try { 
 CRUDstat = CRUDkoneksi.createStatement(); 
 CRUDhasil = CRUDstat.executeQuery(CRUDquery); 
 }catch(SQLException e) { 
     e.printStackTrace();
 }
 return CRUDhasil; 
 }

@Override
 public void simpanData(String id,String nama, String harga, String jumlah)
 { CRUDquery = "insert into tokokomputer values(?,?,?)"; 
 try { 
 CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery); 
 CRUDpsmt.setString(1, id); 
 CRUDpsmt.setString(2, nama); 
 CRUDpsmt.setString(3, harga);
 CRUDpsmt.setString(4, jumlah);
 CRUDpsmt.executeUpdate(); 
 CRUDpsmt.close(); 
 }catch(Exception e) { 
 System.out.println(e);
 }
 }

@Override
 public void ubahData(String id,String nama, String harga, String jumlah) 
 { CRUDquery = "update tokokomputer set nama=?, harga=?, jumlah=?, where id=?"; 
 try { 
 CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery); 
 CRUDpsmt.setString(1, nama); 
 CRUDpsmt.setString(2, harga);
 CRUDpsmt.setString(3, jumlah); 
 CRUDpsmt.setString(4, id); 
 CRUDpsmt.executeUpdate(); 
 CRUDpsmt.close(); 
 } catch (Exception e) { 
 System.out.println(e);
 }
 }

@Override
 public void hapusData(String id) 
 { CRUDquery = "delete from tokokomputer where id=?";
 try {
 CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery); 
 CRUDpsmt.setString(1, id); 
 CRUDpsmt.executeUpdate(); 
 CRUDpsmt.close(); 
 } catch (Exception e) { 
 System.out.println(e); 
}
}   
}

