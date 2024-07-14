/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p250624;


public class Warnet {
    
    private String kode;
    private String namaPelanggan;
    private String jenisPelanggan;
    private String tglMasuk;
    private int jamMasuk;
    private int jamKeluar;
    private int tarif;
   
    public Warnet(){
        
    }
    
    public Warnet(String kode, String namaPelanggan, String jenisPelanggan, String tglMasuk,
            int jamMasuk, int jamKeluar, int tarif){
        this.kode = kode;
        this.namaPelanggan = namaPelanggan;
        this.jenisPelanggan = jenisPelanggan;
        this.tglMasuk = tglMasuk;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.tarif = tarif;
        
        
    }

    
    public String getKode() {
        return kode;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getJenisPelanggan() {
        return jenisPelanggan;
    }

    public String getTglMasuk() {
        return tglMasuk;
    }

    public int getJamMasuk() {
        return jamMasuk;
    }

    public int getJamKeluar() {
        return jamKeluar;
    }

    public int getTarif() {
        return tarif;
    }

    
    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setJenisPelanggan(String jenisPelanggan) {
        this.jenisPelanggan = jenisPelanggan;
    }

    public void setTglMasuk(String tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public void setJamMasuk(int jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public void setJamKeluar(int jamKeluar) {
        this.jamKeluar = jamKeluar;
        
    }
    
    public int hitungLama(){
        return jamKeluar - jamMasuk;
    }
    
    public double diskon(){
        double diskon;
        int lama = hitungLama();
        if (this.jenisPelanggan=="VIP" && lama>2) {
            diskon=0.02;
        }else if (this.jenisPelanggan=="GOLD" && lama>2) {
            diskon=0.05;
        }else{
            diskon=0;
        }
        return diskon;
    }
    
    public int hitungDiskon(){
        double diskon = diskon();
        int lama = hitungLama();
        int totalDiskon = (int) (lama*this.tarif*diskon);
        return totalDiskon;
        
    }
    
    public int hitungTotal(){
        int lama = hitungLama();
        int diskon = hitungDiskon();
        int total = lama*this.tarif-diskon;
        return total;
    }
    
    

    
    
    
}
