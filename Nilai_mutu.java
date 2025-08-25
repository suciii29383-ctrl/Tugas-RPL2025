/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai_mutu;
import java.util.Scanner;

/**
 *
 * @author MyBook Hype
 */
public class Nilai_mutu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai;
        Scanner input= new Scanner (System.in);
        System.out.println("masukin Nilai Kamu");
        nilai=input.nextInt ();
    
    if (nilai> 90&& nilai<=100) { 
        System.out.println("Anda mendapatkan nilai A");
    }
    else if (nilai >=80 && nilai <=89) {
        System.out.println("Anda mendapatkan nilai B");
    }
    else if (nilai >= 70 && nilai <= 79) {
        System.out.println("Anda mendapatkan nilai C");
    }
    else if (nilai >=50 && nilai <=69) {
        System.out.println("Anda mendapatkan nilai D");
    }
    else if (nilai < 50 ){
        System.out.println("Anda mendapatkan nilai E");
    }
    else {
    System.out.println("Nilai tidak terdaftar");
    }
    
        
}
}
