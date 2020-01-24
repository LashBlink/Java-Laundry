/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;


import java.io.*;
import java.sql.*;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class tambahdata {
   
    String user="root";
    String pwd ="";
    String host="localhost";
    String db="laundry";
    String urlValue = "";
    
    static void TambahData(){
        
      tambahdata md = new tambahdata();
      
    
    try
        {
            //Koneksi database
            Class.forName("com.mysql.jdbc.Driver");
            md.urlValue = "jdbc:mysql://"+md.host+"/"+md.db+"?user="+md.user+"&password="+md.pwd;
            Connection conn = DriverManager.getConnection(md.urlValue);
            
            PreparedStatement pStatement = null;
        String sql = "INSERT INTO `transaksi`(`no_order`,`nama`,`alamat`,`tanggal`,`no_telp`)"+"VALUES(?,?,?,?,?);";
        
        Scanner inp = new Scanner(System.in);
        
           
            System.out.println("===== Tambah Data Laundry =====");
            
           pStatement = conn.prepareStatement(sql);
           
            System.out.println("=== Penambahan Data Tabel Transkasi ===");
           
            System.out.print("Masukan No Order : ");
            pStatement.setString(1, inp.nextLine());
            
            System.out.print("Masukan Nama Pelanggan : ");
            pStatement.setString(2, inp.nextLine());
            
            System.out.print("Masukan Alamat : ");
            pStatement.setString(3, inp.nextLine());
            
            System.out.print("Masukan Tanggal : ");
            pStatement.setString(4, inp.nextLine());
            
            System.out.print("Masukan No.Telpon : ");
            pStatement.setString(5, inp.nextLine()); 
            
            
        
        int intBaris = pStatement.executeUpdate();
        if (intBaris > 0)
        {
            System.out.println("Penambahan data Berhasil");
        }
        else
        {
            System.out.println("Penambahan data gagal");
        }
        
        pStatement.close();    
        conn.close();
        }
        
        
        catch (SQLException e)
        {
            System.out.println("Koneksi Gagal"+e.toString());
            System.out.println("");
            TambahData();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("JDBC Driver tidak ditemukan");
        }
    }
}

 class tambahdata2 {
   
    String user="root";
    String pwd ="";
    String host="localhost";
    String db="laundry";
    String urlValue = "";
    
    static void TambahData2(){
        
      tambahdata2 md = new tambahdata2();
      
    
    try
        {
            //Koneksi database
            Class.forName("com.mysql.jdbc.Driver");
            md.urlValue = "jdbc:mysql://"+md.host+"/"+md.db+"?user="+md.user+"&password="+md.pwd;
            Connection conn = DriverManager.getConnection(md.urlValue);
            
            PreparedStatement pStatement = null;
        
        String sql1 = "INSERT INTO `paket`(`no_paket`,`paket`,`harga`)"+"VALUES(?,?,?);";
        
        
        Scanner inp = new Scanner(System.in);
        
            
           pStatement = conn.prepareStatement(sql1);
            
            System.out.println("=== Penambahan Data Tabel Paket ===");
           
            System.out.print("Masukan No Paket : ");
            pStatement.setString(1, inp.nextLine());
            
            System.out.print("Masukan Paket : ");
            pStatement.setString(2, inp.nextLine());
            
            System.out.print("Masukan Harga : ");
            pStatement.setString(3, inp.nextLine());
            
                  
        
       
        
        //Pengecekan Berhasil atau tidak data diinput
        int intBaris = pStatement.executeUpdate();
        if (intBaris > 0)
        {
            System.out.println("Penambahan data Berhasil");
        }
        else
        {
            System.out.println("Penambahan data gagal");
        }
        
        pStatement.close();    
        conn.close();
        }
        
        
        catch (SQLException e)
        {
            System.out.println("Koneksi Gagal"+e.toString());
            System.out.println("");
            TambahData2();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("JDBC Driver tidak ditemukan");
        }
    }
}

class tambahdata3 {

   
    String user="root";
    String pwd ="";
    String host="localhost";
    String db="laundry";
    String urlValue = "";
    
    static void TambahData3(){
        
      tambahdata3 md = new tambahdata3();
      
    
    try
        {
            //Koneksi database
            Class.forName("com.mysql.jdbc.Driver");
            md.urlValue = "jdbc:mysql://"+md.host+"/"+md.db+"?user="+md.user+"&password="+md.pwd;
            Connection conn = DriverManager.getConnection(md.urlValue);
            
            PreparedStatement pStatement = null;
       
        String sql2 = "INSERT INTO `detail_transaksi`(`no_order`,`no_paket`,`pewangi`,`pcs`,`jumlah`,`total`,`total_bayar`,`pembayaran`,`jumlah_bayar`,`kembali`,`kasir`)"+"VALUES(?,?,?,?,?,?,?,?,?);";
        
        Scanner inp = new Scanner(System.in);
        
    
         pStatement = conn.prepareStatement(sql2);
            
            System.out.println("=== Penambahan Data Tabel Detail Transaksi ===");
        
         System.out.print("Masukkan No Order : ");
            pStatement.setString(1, inp.nextLine());
            
            System.out.print("Masukkan No Paket : ");
            pStatement.setString(2, inp.nextLine());
         
            System.out.print("Masukkan Pewangi : ");
            pStatement.setString(3, inp.nextLine());
            
            System.out.print("Masukkan PCS : ");
            pStatement.setString(4, inp.nextLine());
            
            System.out.print("Masukan Jumlah : ");
            pStatement.setString(5, inp.nextLine());
            
            System.out.print("Masukan Total : ");
            pStatement.setString(6, inp.nextLine());
            
            System.out.print("Masukan Total Bayar : ");
            pStatement.setString(7, inp.nextLine());

            System.out.print("Masukan Pembayaran : ");
            pStatement.setString(8, inp.nextLine());
            
            System.out.print("Masukan Jumlah Pembayaran : ");
            pStatement.setString(9, inp.nextLine());
            
            System.out.print("Masukan Kembalian : ");
            pStatement.setString(10, inp.nextLine());
            
            System.out.print("Masukan Nama Kasir : ");
            pStatement.setString(11, inp.nextLine()); 

            
            
        int intBaris = pStatement.executeUpdate();
        if (intBaris > 0)
        {
            System.out.println("Penambahan data Berhasil");
        }
        else
        {
            System.out.println("Penambahan data gagal");
        }
        
        pStatement.close();    
        conn.close();
        }
        
        
        catch (SQLException e)
        {
            System.out.println("Koneksi Gagal"+e.toString());
            System.out.println("");
            //TambahData();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("JDBC Driver tidak ditemukan");
        }
    }
}
