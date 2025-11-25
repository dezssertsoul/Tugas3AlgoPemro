/*
 */
package tugas3_ap;

import java.util.Scanner;
/**
 *
 * @author Echaa Aditya
 */

public class Tugas3_AP {

    /**
     */
    public static void main(String[] args) {
        
        //Array Gaji 3 Golongan Karyawan
        double [] gaji = {5000000.0, 6500000.0, 9500000.0};
        
        //Array Persen Lembur
        int [] arrayPersenLembur = {30, 32, 34, 36, 38};
        
        //Variabel untuk Perhitungan
        double gajiPokok = 0.0;
        double persentaseLembur = 0.0;
        double gajiLembur = 0.0;
        double totalGaji = 0.0;
        
        //Variabel untuk Input
        String golongan;
        int jamLembur = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        //Proses Input
        System.out.println ("Program Hitung Gaji Karyawan");
        System.out.println ("Masukkan Golongan Karyawan (A/B/C): ");
        golongan = scanner.nextLine().toUpperCase();
        System.out.println ("Masukkan Jam Lembur: ");
        if (scanner.hasNextInt()) {
            jamLembur = scanner.nextInt();
        }
        scanner.close();
        
        //Hitung Gaji Pokok
        int indeksGaji = 0;
        
        if (golongan.equals("A")){
            indeksGaji = 0;
        } else if (golongan.equals("B")){
            indeksGaji = 1;
        } else if (golongan.equals("C")){
            indeksGaji = 2;
        } else {
            System.out.println("Error = Golongan Tidak Valid!");
            return;
    }
        gajiPokok = gaji[indeksGaji];
        
        int indeksPersentaseLembur;
        if (jamLembur == 1){
            indeksPersentaseLembur = 0;
        } else if (jamLembur == 2){
            indeksPersentaseLembur = 1;
        } else if (jamLembur == 3){
            indeksPersentaseLembur = 2;
        } else if (jamLembur == 4){
            indeksPersentaseLembur = 3;
        } else if (jamLembur >= 5){
            indeksPersentaseLembur = 4;
        } else {
            persentaseLembur = 0.0;
            indeksPersentaseLembur = -1;
        }
        
        if (indeksPersentaseLembur != -1) {
            persentaseLembur = (double) arrayPersenLembur[indeksPersentaseLembur]/100.0;
        }
        
        //Hitung Gaji Lembur
        gajiLembur = persentaseLembur * gajiPokok * jamLembur;
        
        //Hitung Total Gaji
        totalGaji = gajiPokok + gajiLembur;
        
        //Output
        System.out.println ("Detail Gaji Karyawan");
        System.out.println ("Golongan Karyawan : " +golongan);
        System.out.println ("Jam Lembur: " + jamLembur + " jam");
        System.out.println ("Total Gaji : Rp. " + String.format("%,.0f", totalGaji));
        
        if (jamLembur > 0){
            System.out.println ("Persentase Lembur per jam: " + (persentaseLembur * 100) + "%");
            System.out.println ("Total Gaji Lembur: Rp. " + String.format("%,.0f", gajiLembur));
        } else {
            System.out.println ("Tidak Ada Lembur");
        }
        
        System.out.println ("Total Gaji Diterima: Rp. " + String.format("%,.0f", totalGaji));
    }
}
