/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class Laundry {

    


/**
 *
 * @author Asus
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
       String user = "root";
        String pwd = "";
        String host = "localhost";
        String db = "laundry";
        String urlValue = "";
        
        //Membuat Objek Inp atau input
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        //Mengecek Error dengan try
        
        try {
             //Koneksi database
            Class.forName("com.mysql.jdbc.Driver");
            urlValue = "jdbc:mysql://"+host+"/"+db+"?user="+user+"&password="+pwd;
            Connection conn = DriverManager.getConnection(urlValue);
            
            System.out.println("Koneksi Sukses");
            PreparedStatement pStatement = null;
        
         String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        String ul="",lagi;
        System.out.println("********** SELAMAT DATANG ***********");
        System.out.println(" ");
        System.out.println("             MENU UTAMA             ");
        System.out.println("1. Tambah Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Cari Data");
        System.out.println("5. Keluar");
        System.out.println("=====================================");
        System.out.print("Pilihan [1/2/3/4/5/] = ");
        int pilih = input.nextInt();
        System.out.println("=====================================");
        
       switch (pilih) {
            case 1:{
                tambahdata p1 = new tambahdata();
                tambahdata2 p2= new tambahdata2();
                tambahdata3 p3 = new tambahdata3();
                
                p1.TambahData();
                p2.TambahData2();
                p3.TambahData3();
                break;
            }
            case 2:{
                tampildata q = new tampildata();
                q.TampilData();
                break;
            }
             case 3:{
                editdata r = new editdata();
                r.EditData();
                break;
             }
             case 4:{
                 caridata s = new caridata();
                 s.CariData();
                 break;
             }
             case 5:{
                 updatedata t = new updatedata();
                 t.UpdateData();
                 break;
             }
             
             case 6:{
                System.exit(4);
                System.out.println(" PILIHAN TIDAK TERSEDIA ");
            }
                break;
        }
        System.out.println("=====================================");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulg = input.next();
        
        pStatement.close();    
        conn.close();
        }
        }
        
        
        catch (SQLException e)
        {
            System.out.println("Koneksi Gagal"+e.toString());
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("JDBC Driver tidak ditemukan");
        }  
         }
        }
   
    

    

