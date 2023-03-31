import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import javax.management.ValueExp;

public class biodata {
    public static void main(String[] args) {
    new Scanner(System.in);
    String nama = "Aliilah kalyca raniah";
    int kelas = 10;
    String absen = "guwe absen 4";
    char JK = 'P';
    String alamat = " JL bantaran barat 3 no 8";
    System.out.println("Masukkan nilai anda: ");
    int nilai = scan.nextInt();
    // float  = slot angka terbatas dan untuk koma
    // double = slot angka lebih banyak atau kelipatan float
    // boolean = 0 : false / I = true

    System.out.println("Nama: "+nama);
    System.out.println("--------------------------------------");
    System.out.println("kelas: "+kelas+ "RPL");
    System.out.println("--------------------------------------");
    System.out.println("absen: "+absen);
    System.out.println("--------------------------------------");

    if(JK == "L"){
        Value_jk = "Laki - laki";
    } else if (JK == "P") {
        Value_jk = "Perempuan";
    } else {
        Value_jk = "undefined";
    }
    System.out.println("jenis kelamin: "+JK);
    System.out.println("--------------------------------------");
    System.out.println("alamat: "+alamat);
    System.out.println("--------------------------------------");


    if (nilai < 75){
        System.out.println("remidi");
    } else if (nilai > 75){
        System.out.println("tidak remidi");
    }
        // < : lebih besar
        // > : lebih kecil
        // == : perbandingan
        // =  : menugaskan
        // != : tidak
    System.out.println("nilai: "+nilai);
    System.out.println("--------------------------------------");
    }
}
