import java.util.Scanner;

public class main {
    public static void main(String[] args){
        petik Petik = new petik();
        pukul Pukul = new pukul();

        Scanner scan = new Scanner(System.in);
        System.out.println("petik \t pukul");
        System.out.println("Masukkan pilihan jenis yang anda mau");
        String pilihan = scan.nextLine().toLowerCase();
        System.out.println("");

        if (pilihan.equalsIgnoreCase("petik")){
            Petik.jenis ();
            Petik.harga();
        } else if (pilihan.equalsIgnoreCase("pukul")){
            Pukul.jenis();
            Pukul.harga();
        } 
        }
        }
