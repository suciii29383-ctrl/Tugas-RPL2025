/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author ASUS
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek buku1 dari class Buku 
        book bukul = new book ();
        bukul.judul = "Membuat cookies";
        bukul.penulis = "uci";
        bukul.tahun_terbit = 2025;
        
        book buku2 = new book ();
        buku2.judul = "Membuat minuman";
        buku2.penulis = "cici";
        buku2.tahun_terbit = 2025;
        
        book buku3 = new book ();
        buku3.judul = "Membuat sushi";
        buku3.penulis = "Sucay";
        buku3.tahun_terbit = 2025;
        
        // Menampilkan informasi buku 
        bukul.infoBuku();
         buku2.infoBuku();
          buku3.infoBuku();
    }   
    
}
