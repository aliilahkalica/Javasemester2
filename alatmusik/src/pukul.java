import java.util.Scanner;

public class pukul implements musik {
    Scanner scan = new Scanner(System.in);
    String drum;
    String rebana;
    String kendang;
    String hargadrum;
    String hargarebana;
    String hargakendang;

    @Override
    public void jenis(){
    System.out.println("drum \t rebana \t kendang ");
    System.out.println("Silakan masukan alat musik yang anda inginkan");
    String input = scan.nextLine().toLowerCase();
    System.out.println("--------------------------------------------------");

    if (input.equalsIgnoreCase("drum")){
        System.out.println("alat musik pilihan anda adalah drum");
    } else if (input.equalsIgnoreCase("rebana")){
        System.out.println("alat musik pilihan anda adalah rebana");
    } else if (input.equalsIgnoreCase("kendang")){
        System.out.println("alat musik pilihan anda adalah kendang");
    } else {
        System.out.println("pilihan anda tidak ditemukan");
    }
    }

   @Override
   public void harga(){
    System.out.println("");
        System.out.println("ingin tahu harga? masukkan kembali pilihan anda ");
        System.out.println("masukkan kembali pilihan anda: ");
        String input2 = scan.nextLine().toLowerCase();
        System.out.println("--------------------------------------------------");

       if (input2.equalsIgnoreCase("drum")){
        System.out.println("harga drum adalah 25 jt");
        } else if (input2.equalsIgnoreCase("rebana")){
        System.out.println("harga rebana adalah 2 jt");
        } else if (input2.equalsIgnoreCase("kendang")){
            System.out.println("harga kendang adalah 3 jt");
        }
    }
    }
