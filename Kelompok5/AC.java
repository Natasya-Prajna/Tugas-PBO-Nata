/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok5;

/**
 *
 * @author Asus Gk
 */
public class AC extends Servis{
    
    public AC (long no_servis, String nama, String no_hp, String alamat, String nama_perangkat, String merk_perangkat, String keluhan){
        super (no_servis, nama, no_hp, alamat, nama_perangkat, merk_perangkat, keluhan);
    }
    
    @Override
    public void show (){
        System.out.println("SERVIS Ke-" + 1);
        System.out.println("NO Servis               : "+getNo_servis());
        System.out.println("Nama Client             : "+getNama());
        System.out.println("NO HP                   : "+getNo_hp());
        System.out.println("Alamat                  : "+getAlamat());
        System.out.println("Nama Perangkat          : "+getNama_perangkat());
        System.out.println("Merk Perangkat          : "+getMerk_perangkat());
        System.out.println("Keluhan/Kerusakan       : "+getKeluhan());
    }
    public void show (String estimasi, int harga){
        System.out.println("SERVIS Ke-" + 2);
        System.out.println("NO Servis               : "+getNo_servis());
        System.out.println("Nama Client             : "+getNama());
        System.out.println("NO HP                   : "+getNo_hp());
        System.out.println("Alamat                  : "+getAlamat());
        System.out.println("Nama Perangkat          : "+getNama_perangkat());
        System.out.println("Merk Perangkat          : "+getMerk_perangkat());
        System.out.println("Keluhan/Kerusakan       : "+getKeluhan());
        System.out.println("Estimasi Kerja          : "+estimasi);
        System.out.println("Harga Repair            :"+harga);
    }
    
}
