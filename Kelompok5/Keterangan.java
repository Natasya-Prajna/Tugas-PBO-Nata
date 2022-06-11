package Kelompok5;

public class Keterangan implements Detail {
    long no_servis;
    String nama,tanggal,no_hp,alamat,nama_perangkat,merk_perangkat,keluhan;
    
    public Keterangan(long no_servis, String nama, String no_hp, String alamat, String nama_perangkat, String merk_perangkat, String keluhan){
        this.no_servis = no_servis;
        this.nama = nama;
        this.no_hp = no_hp;
        this.alamat = alamat;
        this.nama_perangkat = nama_perangkat;
        this.merk_perangkat = merk_perangkat;
        this.keluhan = keluhan;
    }
            
    @Override
    public void Servis1() {
       System.out.println("No Servis        :   "+ this.no_servis); 
       System.out.println("Nama Client      :   "+ this.nama);
       System.out.println("No HP            :   "+ this.no_hp);
       System.out.println("alamat           :   "+ this.alamat);
       System.out.println("Nama Perangakat  :   "+ this.nama_perangkat);
       System.out.println("Merk Perangkat   :   "+ this.merk_perangkat);
       System.out.println("keluhan          :   "+ this.keluhan);
    }
    

    @Override
    public void Servis2() {
       System.out.println("No Servis        :   "+ this.no_servis); 
       System.out.println("Nama Client      :   "+ this.nama);
       System.out.println("No HP            :   "+ this.no_hp);
       System.out.println("alamat           :   "+ this.alamat);
       System.out.println("Nama Perangakat  :   "+ this.nama_perangkat);
       System.out.println("Merk Perangkat   :   "+ this.merk_perangkat);
       System.out.println("keluhan          :   "+ this.keluhan);    }
}
