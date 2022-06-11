package Kelompok5;

class MainServis extends Servis {

    public MainServis(){
        
    }
    
    public MainServis (long no_servis, String nama, String no_hp, String alamat, String nama_perangkat, String merk_perangkat, String keluhan){
        super (no_servis, nama, no_hp, alamat, nama_perangkat, merk_perangkat, keluhan);
    }

    @Override
    public void show(){
            System.out.println("SERVIS Ke-" + 1);
            System.out.println("NO Servis               : "+getNo_servis());
            System.out.println("Nama Client             : "+getNama());
            System.out.println("NO HP                   : "+getNo_hp());
            System.out.println("Alamat                  : "+getAlamat());
            System.out.println("Nama Perangkat          : "+getNama_perangkat());
            System.out.println("Merk Perangkat          : "+getMerk_perangkat());
            System.out.println("Keluhan/Kerusakan       : "+getKeluhan());
    }

}
