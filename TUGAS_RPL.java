/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_rpl;
import java.util.Scanner;
/**
 *
 * @author MyBook Hype
 */
public class TUGAS_RPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner(System.in);

        System.out.println("=== Menu Paket Makanan ===");
        System.out.println("1. Paket Ayam   - Rp.15.000");
        System.out.println("2. Paket Ikan   - Rp.20.000");
        System.out.println("3. Paket Daging - Rp.30.000");
        System.out.println("4. Paket Sayur  - Rp.10.000");
        System.out.print("Pilih paket (1-4): ");
        int pilihan = input.nextInt();
  int harga = 0;

        switch (pilihan) {
            case 1:
                harga = 15000;
                System.out.println("Anda memilih Paket Ayam.");
                break;
            case 2:
                harga = 20000;
                System.out.println("Anda memilih Paket Ikan.");
                break;
            case 3:
                harga = 30000;
                System.out.println("Anda memilih Paket Daging.");
                harga -= 5000; // potongan Rp.5000
                System.out.println("Selamat, Anda mendapat potongan Rp.5000!");
                break;
            case 4:
                harga = 10000;
                System.out.println("Anda memilih Paket Sayur.");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return; // keluar dari program
        }

        System.out.println("Total yang harus dibayarkan: Rp." + harga);

    }
    
}// TODO code application logic here
