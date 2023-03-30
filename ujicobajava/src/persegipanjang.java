import java.util.Scanner;

public class persegipanjang extends Bangundatar {
    Scanner scan = new Scanner(System.in);
    float panjang;
    float lebar;
    float tinggi;
    
    @Override
    float luas (){
        System.out.println("Masukkan panjang: ");
        float panjang = scan.nextFloat();
        System.out.println("Masukkan lebar: ");
        float lebar = scan.nextFloat();
        System.out.println("Masukkan tinggi: ");
        float tinggi = scan.nextFloat();
        float luas = panjang * lebar * tinggi;
        System.out.println("Luas persegi panjang adalah: "+luas);
        return luas;
    }
    @Override
    float keliling (){
        System.out.println("Masukkan panjang: ");
        float panjang = scan.nextFloat();
        System.out.println("Masukkan lebar: ");
        float lebar = scan.nextFloat();
        System.out.println("Masukkan tinggi: ");
        float tinggi = scan.nextFloat();
        float keliling = 2*panjang + 2*lebar + 2*tinggi;
        System.out.println("keliling persegi panjang adalah: "+keliling);
        return keliling;
    }
}
