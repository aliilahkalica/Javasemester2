import java.util.Scanner;

public class persegi extends Bangundatar {
    Scanner scan = new Scanner(System.in);
    float sisi;

    @Override
    float luas(){
        System.out.println("Masukkan sisi persegi: ");
        float sisi = scan.nextFloat();
        float luas = sisi * sisi;
        System.out.println("Luas dari persegi adalah:" +luas);
        return luas;
        
    }
    @Override
    float keliling(){
        System.out.println("Masukkan sisi persegi: ");
        float sisi = scan.nextFloat();
        float keliling = 4 * sisi;
        System.out.println("Keliling dari persegi anda adalah: "+keliling);
        return keliling;
    }
}