/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoKomputer;

/**
 *
 * @author galang finto
 */
public abstract class AbstractCRUD {
    protected String id, nama, harga, jumlah;

    public abstract void setID(String id);
    public abstract String getID();
    public abstract void setNama(String nama);
    public abstract String getNama();
    public abstract void setHarga(String harga);
    public abstract String getHarga();
    public abstract void setJumlah(String jumlah);
    public abstract String getJumlah();
}
