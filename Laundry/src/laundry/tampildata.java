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
public class tampildata {
    String user="root";
    String pwd ="";
    String host="localhost";
    String db="laundry";
    String urlValue = "";
    
    static void TampilData() {
    tampildata md = new tampildata();
   // Main mn = new Main();
    //Menu mu = new Menu();
    ResultSet hasil = null;
    
    
    try {
         //Koneksi database
            Class.forName("com.mysql.jdbc.Driver");
            md.urlValue = "jdbc:mysql://"+md.host+"/"+md.db+"?user="+md.user+"&password="+md.pwd;
            Connection conn = DriverManager.getConnection(md.urlValue);
            
             PreparedStatement pStatement = null;
             String sql = "SELECT  no_order,nama,alamat,tanggal,no_telp FROM transaksi;";
             Statement sta = conn.createStatement();
             hasil = sta.executeQuery(sql);
             
    try {
        System.out.println("===================================== Tabel Transaksi =====================================");
        System.out.println("===========================================================================================");
        System.out.println("|  No Order  \t|  Nama Pelanggan \t|  Alamat  \t|  Tanggal  \t|  No Telp  \t|");
        System.out.println("===========================================================================================");
        while (hasil.next()){
            String nd = hasil.getString("no_order");
            String nm = hasil.getString("nama");
            String almt = hasil.getString("alamat");
            String tgl = hasil.getString("tanggal");
            String notlp = hasil.getString("no_telp");
            int jmlnd = nd.length();
            int jmlnp = nm.length();
            int jmlalmt = almt.length();
            int jmltgl = tgl.length();
            int jmltlp = notlp.length();
            int max = 20 - jmlnd;
            int max2 = 20 - jmlnp;
            int max3 = 40 - jmlalmt;
            int max4 = 20 - jmltgl;
            int max5 = 13 -jmltlp;
            
            System.out.println("| "+jmlnd);
            for (int i = 0; i<=max5; i++){
                System.out.print("");
            }
            if(jmlnd > 20){
                nd = nd.substring(0,20);
                System.out.print("| "+nd+"     \t| ");
            } else {
                System.out.print("| "+nd+"     \t| ");
            }
            for (int i=0; i<=max; i++){
                System.out.print("");
            }
            System.out.print(" "+nm);
            for (int j=0; j<=max2; j++){
            System.out.print("");
        }
            System.out.print("  \t\t|  "+almt);
            System.out.print("\t|  "+tgl);
            System.out.print("\t|  "+notlp+"     \t|");
        }
        System.out.println("");
        System.out.println("===========================================================================================");
        
    }
    catch(SQLException e){
        System.out.println(e);
    }
   sta.close();
        conn.close();
             
    }
    catch(SQLException e){
        System.out.println(e);
    }
     catch (ClassNotFoundException e)
        {
            System.out.println("JDBC Driver tidak ditemukan");
        }
    
}
}
