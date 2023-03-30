import java.util.Scanner;

public class petik implements musik {
    Scanner scan = new Scanner(System.in);
    String gitar;
    String siter;
    String kecapi;
    String hargagitar;
    String hargasiter;
    String hargakecapi;
    
    @Override
    public void jenis(){
    System.out.println("gitar \t siter \t kecapi ");
    System.out.println("Silakan masukan alat musik yang anda inginkan");
    String input = scan.nextLine().toLowerCase();
    System.out.println("--------------------------------------------------");

    if (input.equalsIgnoreCase("gitar")){
        System.out.println("alat musik pilihan anda adalah gitar");
    } else if (input.equalsIgnoreCase("siter")){
        System.out.println("alat musik pilihan anda adalah siter");
    } else if (input.equalsIgnoreCase("kecapi")){
        System.out.println("alat musik pilihan anda adalah kecapi");
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

       if (input2.equalsIgnoreCase("gitar")){
        System.out.println("harga gitar adalah 20 jt");
        } else if (input2.equalsIgnoreCase("siter")){
        System.out.println("harga siter adalah 5 jt");
        } else if (input2.equalsIgnoreCase("kecapi")){
            System.out.println("harga kecapi adalah 8 jt");
        }
    }
    }
//}
