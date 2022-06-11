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
public class HP extends Servis {
    
    public HP(long no_servis, String nama, String no_hp, String alamat, String nama_perangkat, String merk_perangkat, String keluhan){
        super (no_servis, nama, no_hp, alamat, nama_perangkat, merk_perangkat, keluhan);
    }
    
    @Override
    public void show (){
        System.out.println("SERVIS Ke-" + 4);
        System.out.println("NO Servis               : "+getNo_servis());
        System.out.println("Nama Client             : "+getNama());
        System.out.println("NO HP                   : "+getNo_hp());
        System.out.println("Alamat                  : "+getAlamat());
        System.out.println("Nama HandPhone          : "+getNama_perangkat());
        System.out.println("Merk HandPhone          : "+getMerk_perangkat());
        System.out.println("Keluhan/Kerusakan       : "+getKeluhan());
    }
    
}
