import java.util.Scanner;

public class lingkaran extends Bangundatar {
    Scanner scan = new Scanner(System.in);
    float jari;

    @Override
    float luas (){
        System.out.println("Masukkan jari jari lingkaran: ");
        float jari = scan.nextFloat();
        float luas = (float)(Math.PI * jari * jari);
        System.out.println("Luas lingkaran adalah: "+luas);
        return luas;
    }
    @Override
    float keliling(){
        System.out.println("Masukkan jari jari lingkaran: ");
        float jari = scan.nextFloat();
        float keliling = (float)(2 * Math.PI * jari);
        System.out.println("Keliling lingkaran adalah: "+keliling);
        return keliling;
    }
    
}
