/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Laundry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        String ul="",lagi;
        System.out.println("********** SELAMAT DATANG ***********");
        System.out.println(" ");
        System.out.println("             MENU UTAMA             ");
        System.out.println("1. Tampil Data ");
        System.out.println("2. Tambah Data ");
        System.out.println("3. Edit Data ");
        System.out.println("4. Hapus Data ");
        System.out.println("5. Cari Data");
        System.out.println("=====================================");
        System.out.print("Pilihan [1/2/3/4/5] = ");
        int pilih = input.nextInt();
        System.out.println("=====================================");

       //switch (pilih) {
         //   case 1:{
           //     PersegiPanjang p=new PersegiPanjang();
             //   p.pp();
               // break;
            //}
            //case 2:{
              //  Lingkaran q=new Lingkaran();
                //q.LuasLingkaran();
                //break;
            //}
             //case 3:{
               // Segitiga r=new Segitiga();
                //r.LuasSegitiga();
                //break;
             //}
            //case 4:{
              //  System.exit(4);
                //System.out.println("Warning !! Pilihan tidak tersedia !! ");
            //}
              //  break;
        //}
        //System.out.println("=====================================");
        //System.out.print("Apakah anda ingin mengulang (y/t)? ");
          //  ulg = input.next();
        }
    }
    }
    

