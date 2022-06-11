/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok5;


abstract class Servis {
    private long no_servis;
    private String nama;
    private String no_hp;
    private String alamat;
    private String nama_perangkat;
    private String merk_perangkat;
    private String keluhan;
    
    
    public Servis(){
        
    }
    
    public Servis(long no_servis, String nama, String no_hp, String alamat, String nama_perangkat, String merk_perangkat, String keluhan){
        this.no_servis = no_servis;
        this.nama = nama;
        this.no_hp = no_hp;
        this.alamat = alamat;
        this.nama_perangkat = nama_perangkat;
        this.merk_perangkat = merk_perangkat;
        this.keluhan = keluhan;
        
    }


    public long getNo_servis() {
        return no_servis;
    }

    public void setNo_servis(long no_servis) {
        this.no_servis = no_servis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama_perangkat() {
        return nama_perangkat;
    }

    public void setNama_perangkat(String nama_perangkat) {
        this.nama_perangkat = nama_perangkat;
    }

    public String getMerk_perangkat() {
        return merk_perangkat;
    }

    public void setMerk_perangkat(String merk_perangkat) {
        this.merk_perangkat = merk_perangkat;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
    public abstract void show ();
}
