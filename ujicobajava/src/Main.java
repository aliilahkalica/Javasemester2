import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Bangundatar bangunDatar = new Bangundatar();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\n1. Persegi \n2. Lingkaran \n3. persegiPanjang \n4. segitiga");
        System.out.print("Masukkan pilihan: ");
        String input = scan.nextLine().toLowerCase();

        persegi Persegi = new persegi();
        Persegi.sisi =0;
        lingkaran Lingkaran = new lingkaran();
        Lingkaran.jari =0;
        persegipanjang persegiPanjang = new persegipanjang();
        persegiPanjang.lebar =0;
        persegiPanjang.panjang =0;
        persegiPanjang.tinggi =0;
        Segitiga segitiga = new Segitiga();
        segitiga.alas =0;
        segitiga.tinggi=0;
        
        if (input.equals("persegi")){
            Persegi.luas();
            // Persegi.keliling();
        } else if (input.equals("lingkaran")) {
            Lingkaran.luas();
            // Lingkaran.keliling();
        } else if (input.equals("persegipanjang")) {
            persegiPanjang.luas();
            // persegiPanjang.keliling();
        } else if (input.equals("segitiga")) {
            segitiga.luas();
        } else 
            System.out.println("Pilihan tidak ada.");
    }
        
    }