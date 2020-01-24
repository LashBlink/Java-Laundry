/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import static laundry.tambahdata.TambahData;

/**
 *
 * @author Asus
 */
public class editdata {
    String user="root";
    String pwd ="";
    String host="localhost";
    String db="laundry";
    String urlValue = "";
    
    
        static void EditData() throws IOException{
            
            editdata md  = new editdata();
            
            BufferedReader userInput = new BufferedReader (new InputStreamReader(System.in));
            Scanner inp = new Scanner(System.in);
            
        try {
            //Koneksi database
            Class.forName("com.mysql.jdbc.Driver");
            md.urlValue = "jdbc:mysql://"+md.host+"/"+md.db+"?user="+md.user+"&password="+md.pwd;
            Connection conn = DriverManager.getConnection(md.urlValue);
            
            
            
           // System.out.print("Masukkan No Order yang ingin diubah : ");
            //String no_order = inp.next();
            //pStatement.setString(1,no_order);
            
        String sql = " update transaksi set nama=?, alamat=?, tanggal=?, no_telp=? WHERE no_order=? ";
        PreparedStatement pStatement = conn.prepareStatement(sql);
        
         System.out.print("Masukkan No Order kolom yang ingin diubah : ");
         pStatement.setString(5, userInput.readLine());;
        
            System.out.print("Masukkan Nama : ");
            pStatement.setString(1, (userInput.readLine()));
            
            System.out.print("Masukkan Alamat : ");
            pStatement.setString(2, (userInput.readLine()));
            
            System.out.print("Masukkan Tanggal : ");
            pStatement.setString(3, (userInput.readLine()));
            
            System.out.print("Masukkan Nomor Telp : ");
            pStatement.setString(4, (userInput.readLine()));
            
            //pStatement.executeUpdate();
            //System.out.println("Update Data Berhasil");
         int intBaris = pStatement.executeUpdate();
        if (intBaris > 0)
        {
            System.out.println("Update Data Berhasil");
        }
        else
        {
            System.out.println("Update Data gagal");
        }
       
        pStatement.close();    
        conn.close();
        }
        
        
        catch (SQLException e)
        {
            System.out.println("Koneksi Gagal"+e.toString());
            System.out.println(e);
            
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("JDBC Driver tidak ditemukan");
        }
        
        
        
        }
            
            
        }


