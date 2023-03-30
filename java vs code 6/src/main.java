import java.util.Scanner;

public class main {
    public static void main(String[] args){
        //Bangundatar bangundatar = new Bangundatar();
        balok Balok = new balok();
        kubus Kubus = new kubus();
        tabung Tabung = new tabung();
        kerucut Kerucut = new kerucut();
        limas Limas = new limas();
        prisma Prisma = new prisma();
        bola Bola = new bola();

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka untuk pilihan jenis bangunan");
        System.out.println("1 \t 2 ");
        System.out.println("Masukkan pilihan anda: ");
        String input1 = scan.nextLine().toLowerCase();

        System.out.println("----------------------------------------");

        if (input1.equalsIgnoreCase("1")){
            System.out.println("Balok\tKubus\tTabung \tKerucut");
            System.out.println("Masukkan pilihan bangunan anda: ");
            String input2 = scan.nextLine().toLowerCase();
            System.out.println("--------------------------------------");
            if (input2.equalsIgnoreCase("Balok")){
                System.out.println("Masukkan panjang balok: ");
                float panjang = scan.nextFloat();
                Balok.panjang = panjang;
                System.out.println("Masukkan lebar balok: ");
                float lebar = scan.nextFloat();
                Balok.lebar = lebar;
                System.out.println("Masukkan tinggi balok: ");
                float tinggi = scan.nextFloat();
                Balok.tinggi = tinggi;
                Balok.volume();

            } if (input2.equalsIgnoreCase("Kubus")){
                System.out.println("Masukkan sisi kubus: ");
                float sisi = scan.nextFloat();
                Kubus.sisi = sisi;
                Kubus.volume();

            } if (input2.equalsIgnoreCase("Tabung")){
                System.out.println("masukkan r atau rusuk tabung: ");
                float r = scan.nextFloat();
                Tabung.r = r;
                System.out.println("Masukkan tinggi tabung: ");
                float tinggi = scan.nextFloat();
                Tabung.tinggi = tinggi;
                Tabung.volume();

            } if (input2.equalsIgnoreCase("Kerucut")){
                System.out.println("masukkan r atau rusuk kerucut: ");
                float r = scan.nextFloat();
                Kerucut.r = r;
                System.out.println("Masukkan tinggi kerucut: ");
                float tinggi = scan.nextFloat();
                Kerucut.tinggi = tinggi;
                Kerucut.volume();
        }
            }  else if (input1.equalsIgnoreCase("2")){
                System.out.println("Limas\tPrisma\tBola");
                System.out.println("Masukkan pilihan anda: ");
                String input3 = scan.nextLine().toLowerCase();
                System.out.println("--------------------------------------");
            if (input3.equalsIgnoreCase("Limas")){
                System.out.println("Masukkan sisi limas: ");
                float sisi = scan.nextFloat();
                Limas.sisi = sisi;
                System.out.println("Masukkan tinggi limas: ");
                float tinggi = scan.nextFloat();
                Limas.tinggi = tinggi;
                Limas.volume();

            } if (input3.equalsIgnoreCase("Prisma")){
                System.out.println("Masukkan alas prisma: ");
                float alas = scan.nextFloat();
                Prisma.alas = alas;
                System.out.println("Masukkan tinggi: ");
                float tinggi = scan.nextFloat();
                Prisma.tinggi = tinggi;
                System.out.println("Masukkan tinggip prisma: ");
                float tinggip = scan.nextFloat();
                Prisma.tinggip = tinggip;
                Prisma.volume();

            } if (input3.equalsIgnoreCase("Bola")){
                System.out.println("Masukkan r atau rusuk bola: ");
                float r = scan.nextFloat();
                Bola.r = r;
                Bola.volume();
            }
            }
            }
            }
