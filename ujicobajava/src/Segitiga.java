import java.util.Scanner;

public class Segitiga extends Bangundatar {
    Scanner scan = new Scanner(System.in);
    float alas;
    float tinggi;
    
    @Override
    float luas (){
        System.out.println("Masukkan alas segitiga: ");
        float alas = scan.nextFloat();
        System.out.println("Masukkan tinggi segitiga: ");
        float tinggi = scan.nextFloat();
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Alas lingkaran adalah: "+luas);
        return luas;
    }
    
    
}
