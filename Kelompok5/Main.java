package Kelompok5;



import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    static ArrayList<String> nama = new ArrayList<>();
    static ArrayList<String> alamat = new ArrayList<>();
    static ArrayList<String> nama_perangkat = new ArrayList<>();
    static ArrayList<String> merk_perangkat = new ArrayList<>();
    static ArrayList<Long> no_servis= new ArrayList<>();
    static ArrayList<String> no_hp = new ArrayList<>();
    static ArrayList<String> keluhan = new ArrayList<>();
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
       
        
        clearScreen();
        System.out.println("\t\t\t======================================");
        System.out.println("\t\t\t=========== LOGIN MENU ===============");
        System.out.println("\t\t\t======================================");
        System.out.print("\t\t\t Username >> ".toLowerCase());
        String Username = input.nextLine();
        System.out.print("\t\t\t Password >> ".toLowerCase());
        String Password = input.nextLine();
        System.out.println("\t\t\t======================================");
        
        if (Username.equals("user") && Password.equals("user")){
            user();
        }
        else if (Username.equals("admin") && Password.equals("admin")){
            admin();
        }
        else{
            System.out.println("\t\t\t======================================");
            System.out.println("\t\t\t=========== Salah Input ==============");
            System.out.println("\t\t\t======================================");
            clearScreen();
            main(args);
        }
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
    
    public static void user(){
        Scanner masukkan = new Scanner(System.in);

        clearScreen();
        System.out.println("\t\t\t======================================");
        System.out.println("\t\t\t========= SERVIS ELEKTRONIK ==========");
        System.out.println("\t\t\t= [1] Create SERVIS                  =");
        System.out.println("\t\t\t= [2] Read SERVIS                    =");
        System.out.println("\t\t\t= [0] Exit                           =");
        System.out.println("\t\t\t======================================");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
        switch (pilihMenu) {
            case 0:
                clearScreen();
                System.out.println("\n\n\n\n");
                System.out.println("\t\t\t=== Anda Keluar ===");
                System.exit(0);
            case 1:
                try {
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ========================");
                System.out.println("\t\t\t    =====  MENU UTAMA  =====");
                System.out.println("\t\t\t    ========================");
                System.out.print("INPUT DATA(1)   : ");
                int banyak = input.nextInt();
                for (int y = 0; y < banyak; y++) {
                    System.out.print("No Servis                       : ");
                    long noservis = input.nextLong();
                    input.nextLine();
                    no_servis.add(noservis);
                    System.out.print("Nama Client                     : ");
                    String name = input.nextLine();
                    nama.add(name);
                    System.out.print("No HP                           : ");
                    String nohp = input.nextLine();
                    no_hp.add(nohp);
                    System.out.print("Alamat                          : ");
                    String almt = input.nextLine();
                    alamat.add(almt);
                    System.out.print("Nama Perangkat                  : ");
                    String perangkat = input.nextLine();
                    nama_perangkat.add(perangkat);
                    System.out.print("Merk Perangkat                  : ");
                    String merk = input.nextLine();
                    merk_perangkat.add(merk);
                    System.out.print("Keluhan/Kerusakan               : ");
                    String kluhan = input.nextLine();
                    keluhan.add(kluhan);
                }
                System.out.print("\n\nDATA SERVIS BERHASIL DITAMBAHKAN!");
                System.out.print("\ntekan ENTER ...");
                input.nextLine();
                user();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Masukkan Ulang Angka Yang Tepat !!");
                user();
            }

            case 2:
                try{
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ===============================");
                System.out.println("\t\t\t    ========= DATA SERVIS =========");
                System.out.println("\t\t\t    ===============================");

                MainServis a = new MainServis();
                a.setNo_servis(1);
                a.setNama("Vigo");
                a.setNo_hp("0813");
                a.setAlamat("Marangkayu");
                a.setNama_perangkat("Handphone");
                a.setMerk_perangkat("ASUS");
                a.setKeluhan("Pecah Layar");
                a.show();
                System.out.println("==========================");

                AC b = new AC(2, "Fajri", "0852", "Samarinda", "Air Conditioner", "Panasonic", "Tidak Dingin");
                b.show("4 Hari", 500000);
                System.out.println("==========================");

                Laptop c = new Laptop(3, "Natasha", "0898", "Bontang", "Laptop", "Asus", "Overheat");
                c.show("2 Hari", 300000, "Potongan Harga 20%");
                System.out.println("==========================");

                HP d = new HP(4, "Ageng", "0846", "Sangatta", "HP", "Iphone 13", "Ganti Batrai");
                d.show();
                System.out.println("==========================");

                for (int y = 0; y < no_servis.size(); y++) {
                    System.out.println("SERVIS Ke-" + (y + 1));
                    System.out.println("NO Servis               : " + no_servis.get(y));
                    System.out.println("Nama Client             : " + nama.get(y));
                    System.out.println("NO HP                   : " + no_hp.get(y));
                    System.out.println("Alamat                  : " + alamat.get(y));
                    System.out.println("Nama Perangkat          : " + nama_perangkat.get(y));
                    System.out.println("Merk Perangkat          : " + merk_perangkat.get(y));
                    System.out.println("Keluhan/Kerusakan       : " + keluhan.get(y));

                    System.out.println("==========================");

                }

                System.out.print("tekan ENTER ...");
                input.nextLine();
                user();
                break;
                } catch (InputMismatchException e) {
                System.out.println("Masukkan Ulang Angka Yang Tepat !!");
                user();
            }
            

            default:
                clearScreen();
                System.out.println("Pilihan Invalid!");
                System.out.print("tekan ENTER ...");
                input.nextLine();
                user();
                break;
        }

    
    }


    static void admin(){
        Scanner masukkan = new Scanner(System.in);
        clearScreen();
        System.out.println("\t\t\t======================================");
        System.out.println("\t\t\t========= SERVIS ELEKTRONIK ==========");
        System.out.println("\t\t\t= [1] Create SERVIS                  =");
        System.out.println("\t\t\t= [2] Read SERVIS                    =");
        System.out.println("\t\t\t= [3] Update SERVIS                  =");
        System.out.println("\t\t\t= [4] Delete SERVIS                  =");
        System.out.println("\t\t\t= [5] Data SERVIS                    =");
        System.out.println("\t\t\t= [0] Exit                           =");
        System.out.println("\t\t\t======================================");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
        switch (pilihMenu) {
            case 0:
                
                clearScreen();
                System.out.println("\n\n\n\n");
                System.out.println("\t\t\t=== Anda Keluar ===");
                System.exit(0);
            case 1:
                try{
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ========================");
                System.out.println("\t\t\t    =====  MENU UTAMA  =====");
                System.out.println("\t\t\t    ========================");
                System.out.print("INPUT DATA   : ");
                int banyak = input.nextInt();
                for(int y = 0 ; y < banyak; y++){
                    System.out.print("No Servis                       : ");
                    long noservis = input.nextLong();
                    input.nextLine(); 
                    no_servis.add(noservis);
                    System.out.print("Nama Client                     : ");
                    String name = input.nextLine();
                    nama.add(name);
                    System.out.print("No HP                           : ");
                    String nohp = input.nextLine();
                    no_hp.add(nohp);
                    System.out.print("Alamat                          : ");
                    String almt = input.nextLine();
                    alamat.add(almt);
                    System.out.print("Nama Perangkat                  : ");
                    String perangkat = input.nextLine();
                    nama_perangkat.add(perangkat);
                    System.out.print("Merk Perangkat                  : ");
                    String merk = input.nextLine();
                    merk_perangkat.add(merk);
                    System.out.print("Keluhan/Kerusakan               : ");
                    String kluhan = input.nextLine();
                    keluhan.add(kluhan);
                }
                System.out.print("\n\nDATA SERVIS BERHASIL DITAMBAHKAN!");
                System.out.print("\ntekan ENTER ...");
                input.nextLine();
                admin();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\nMASUKKAN DATA DENGAN BENAR!!");
                System.out.println("\n\nSILAKAN COBA LAGI!!");
                admin();
            }
            case 2:
                try{
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ===============================");
                System.out.println("\t\t\t    ========= DATA SERVIS =========");
                System.out.println("\t\t\t    ===============================");
                
                
                MainServis a = new MainServis();
                a.setNo_servis(1);
                a.setNama("Vigo");
                a.setNo_hp("0813");
                a.setAlamat("Marangkayu");
                a.setNama_perangkat("Handphone");
                a.setMerk_perangkat("ASUS");
                a.setKeluhan("Pecah Layar");
                a.show();
                System.out.println("==========================");
                
                AC b = new AC(2, "Fajri", "0852", "Samarinda", "Air Conditioner", "Panasonic", "Tidak Dingin");
                b.show("4 Hari", 500000);
                System.out.println("==========================");
                
                Laptop c = new Laptop(3, "Natasha", "0898", "Bontang", "Laptop", "Asus", "Overheat");
                c.show("2 Hari", 300000, "Potongan Harga 20%");
                System.out.println("==========================");
                
                HP d = new HP(4, "Ageng", "0846", "Sangatta", "HP", "Iphone 13", "Ganti Batrai");
                d.show();
                System.out.println("==========================");
                
                                
                
                for(int y = 0; y < no_servis.size(); y++){
                   System.out.println("SERVIS Ke-" + (y+1));
                   System.out.println("NO Servis               : "+no_servis.get(y));
                   System.out.println("Nama Client             : "+nama.get(y));
                   System.out.println("NO HP                   : "+no_hp.get(y));
                   System.out.println("Alamat                  : "+alamat.get(y));
                   System.out.println("Nama Perangkat          : "+nama_perangkat.get(y));
                   System.out.println("Merk Perangkat          : "+merk_perangkat.get(y));
                   System.out.println("Keluhan/Kerusakan       : "+keluhan.get(y));

                   System.out.println("==========================");

                }

                System.out.print("tekan ENTER ...");
                input.nextLine();
                admin();
                break;
                } catch (InputMismatchException e) {
                System.out.println("\n\nMASUKKAN DATA DENGAN BENAR!!");
                System.out.println("\n\nSILAKAN COBA LAGI!!");
                admin();
            }
                
            case 3 :
                try{
                clearScreen();
                for(int y = 0; y < no_servis.size(); y++){
                   System.out.println("SERVIS Ke-" + (y+1));
                   System.out.println("NO Servis               : "+no_servis.get(y));
                   System.out.println("Nama Client             : "+nama.get(y));
                   System.out.println("NO HP                   : "+no_hp.get(y));
                   System.out.println("Alamat                  : "+alamat.get(y));
                   System.out.println("Nama Perangkat          : "+nama_perangkat.get(y));
                   System.out.println("Merk Perangkat          : "+merk_perangkat.get(y));
                   System.out.println("Keluhan/Kerusakan       : "+keluhan.get(y));
                   System.out.println("==========================");

                }

                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ===============================");
                System.out.println("\t\t\t    ===  MENGUPDATE DATA SERVIS ===");
                System.out.println("\t\t\t    ===============================");
                System.out.print("Data yang diubah : ");
                int edit = input.nextInt();



                System.out.print("No Servis                    : ");
                long noservis2 = input.nextLong();
                input.nextLine();
                no_servis.set((edit-1), noservis2);
                System.out.print("Nama Client                  : ");
                String name2 = input.nextLine();
                nama.set((edit-1), name2);
                System.out.print("NO HP                        : ");
                String nohp2 = input.nextLine();
                no_hp.set((edit-1),nohp2);
                System.out.print("Alamat                       : ");
                String almt2 = input.nextLine();
                alamat.set((edit-1),almt2);
                System.out.print("Nama Perangkat               : ");
                String perangkat2 = input.nextLine();
                nama_perangkat.set((edit-1),perangkat2);
                System.out.print("Merk Perangkat               : ");
                String merk2 = input.nextLine();
                merk_perangkat.set((edit-1),merk2);
                System.out.print("Keluhan/Kerusakan            : ");
                String kluhan2 = input.nextLine();
                keluhan.set((edit-1),kluhan2);


                System.out.print("\nDATA TELAH TERUPDATE");

                System.out.print("\ntekan ENTER ...");
                input.nextLine();
                admin();
                break;
                } catch (InputMismatchException e) {
                System.out.println("\n\nMASUKKAN DATA DENGAN BENAR!!");
                System.out.println("\n\nSILAKAN COBA LAGI!!");
                admin();
            }

            case 4 :
                try{
                clearScreen();
                for(int y = 0; y < no_servis.size(); y++){
                   System.out.println("SERVIS Ke-" + (y+1));
                   System.out.println("NO Servis               : "+no_servis.get(y));
                   System.out.println("Nama Client             : "+nama.get(y));
                   System.out.println("NO HP                   : "+no_hp.get(y));
                   System.out.println("Alamat                  : "+alamat.get(y));
                   System.out.println("Nama Perangkat          : "+nama_perangkat.get(y));
                   System.out.println("Merk Perangkat          : "+merk_perangkat.get(y));
                   System.out.println("Keluhan/Kerusakan       : "+keluhan.get(y));
                   System.out.println("==========================");
                }

                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ===============================");
                System.out.println("\t\t\t    ======   MENGHAPUS DATA  ======");
                System.out.println("\t\t\t    ===============================");
                System.out.print("Data yang dihapus : ");
                int hapus = input.nextInt();
                no_servis.remove((hapus-1));
                nama.remove((hapus-1));
                no_hp.remove((hapus-1));
                alamat.remove((hapus-1));
                nama_perangkat.remove((hapus-1));
                merk_perangkat.remove((hapus-1));
                keluhan.remove((hapus-1));

                System.out.print("tekan ENTER ...");
                input.nextLine();
                admin();
                break;
                } catch (InputMismatchException e) {
                System.out.println("\n\nMASUKKAN DATA DENGAN BENAR!!");
                System.out.println("\n\nSILAKAN COBA LAGI!!");
                admin();
            }
                
            case 5 :
                try{
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("===============================");
                System.out.println("========= DATA SERVIS =========");
                System.out.println("===============================");

                Keterangan Servis1 = new Keterangan (1,"Vigo","0812587328","Jln.kenangan","handphone","Iphone 13","Tombol On/off");
                Keterangan Servis2 = new Keterangan (2,"Fajri","0858123023","Jln.patah hati","Handphone","POCO","Layar Pecah");
                 
                Servis1.Servis1();
                System.out.println("==============================================");
                Servis2.Servis2();
                System.out.println("==============================================");
                System.out.println("sedang dalam proses pengerjaan");
                
                for(int y = 0; y < no_servis.size(); y++){
                
                System.out.println("NO Servis               : "+no_servis.get(y));
                System.out.println("Nama Client             : "+nama.get(y));
                System.out.println("NO HP                   : "+no_hp.get(y));
                System.out.println("Alamat                  : "+alamat.get(y));
                System.out.println("Nama Perangkat          : "+nama_perangkat.get(y));
                System.out.println("Merk Perangkat          : "+merk_perangkat.get(y));
                System.out.println("Keluhan/Kerusakan       : "+keluhan.get(y));
                System.out.println("==========================");
            }                

                System.out.print("tekan ENTER ...");
                input.nextLine();
                admin();
                break;
                } catch (InputMismatchException e) {
                System.out.println("\n\nMASUKKAN DATA DENGAN BENAR!!");
                System.out.println("\n\nSILAKAN COBA LAGI!!");
                admin();
            }

            default:
                clearScreen();
                System.out.println("Pilihan Invalid!");
                System.out.print("tekan ENTER ...");
                input.nextLine();
                admin();
                break; 
        }
                
    }
}
 
