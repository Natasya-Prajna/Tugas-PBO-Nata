/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kelompok5;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.util.InputMismatchException;



public class Main2 extends Servis{
        
        Scanner input = new Scanner(System.in);
        Scanner masukkan = new Scanner(System.in);
        Scanner Masukkan = new Scanner(System.in);
        public Main2 (long no_servis, String nama, String no_hp, String alamat, String nama_perangkat, String merk_perangkat, String keluhan){
        super (no_servis, nama, no_hp, alamat, nama_perangkat, merk_perangkat, keluhan);
    }

    static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }
    
    
    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
