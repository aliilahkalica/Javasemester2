import java.util.Scanner;

import javax.swing.CellRendererPane;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        employee Employee = new employee();
        System.out.println("pilih jabatan anda : \n1. boss \n2. manager \n3. security \n4. cleaning");
        System.out.println("Masukkan pilihan jabatan anda: ");
        String input = scan.nextLine().toLowerCase();

        if (input.equals("boss")) {
            boss Boss = new boss();
            Boss.setNama("Aliilah");
            Boss.setJabatan("boss");
            Boss.setStatus("menikah");
            Boss.setGaji(10_000_000);
            Boss.setJamkerja(8);
            Boss.setBonus(200_000);
            Boss.setPotongan(0);
            int jumlah = Boss.getgaji() + Boss.getbonus() - Boss.getpotongan();

            System.out.println("=========================================");
            System.out.println("Nama anda: " +Boss.getnama());
            System.out.println("Jabatan anda: "+Boss.getjabatan());
            System.out.println("Status anda: "+Boss.getstatus());
            System.out.println("Gaji anda: "+Boss.getgaji());
            System.out.println("jam kerja anda: "+Boss.getjamkerja());
            System.out.println("=========================================");
            System.out.println("Total gaji anda adalah: " +jumlah);
            System.out.println("=========================================");
            System.out.println("Selamat menikmati gaji anda, dan jangan lupa untuk terus tingkatkan kinerja anda!");

    } else if (input.equals("manager")) {
            manager Manager = new manager();
            Manager.setNama("Aliilah");
            Manager.setJabatan("manager");
            Manager.setStatus("belum menikah");
            Manager.setGaji(5_000_000);
            Manager.setJamkerja(6);
            Manager.setBonus(200_000);
            Manager.setPotongan(50);
            int jumlah = Manager.getgaji() + Manager.getbonus() - Manager.getpotongan();

            System.out.println("=========================================");
            System.out.println("Nama anda: " +Manager.getnama());
            System.out.println("Jabatan anda: "+Manager.getjabatan());
            System.out.println("Status anda: "+Manager.getstatus());
            System.out.println("Gaji anda: "+Manager.getgaji());
            System.out.println("jam kerja anda: "+Manager.getjamkerja());
            System.out.println("=========================================");
            System.out.println("Total gaji anda adalah: " +jumlah);
            System.out.println("=========================================");
            System.out.println("Selamat menikmati gaji anda, dan jangan lupa untuk terus tingkatkan kinerja anda!");

    } else if (input.equals("security")) {
            security Security = new security();
            Security.setNama("Aliilah");
            Security.setJabatan("security");
            Security.setStatus("menikah");
            Security.setGaji(3_000_000);
            Security.setJamkerja(8);
            Security.setBonus(400_000);
            Security.setPotongan(0);
            int jumlah = Security.getgaji() + Security.getbonus() - Security.getpotongan();

            System.out.println("=========================================");
            System.out.println("Nama anda: " +Security.getnama());
            System.out.println("Jabatan anda: "+Security.getjabatan());
            System.out.println("Status anda: "+Security.getstatus());
            System.out.println("Gaji anda: "+Security.getgaji());
            System.out.println("jam kerja anda: "+Security.getjamkerja());
            System.out.println("=========================================");
            System.out.println("Total gaji anda adalah: " +jumlah);
            System.out.println("=========================================");
            System.out.println("Selamat menikmati gaji anda, dan jangan lupa untuk terus tingkatkan kinerja anda!");

    } else if (input.equals("cleaning")) {
            cleaning Cleaning = new cleaning();
            Cleaning.setNama("Aliilah");
            Cleaning.setJabatan("cleaning servise");
            Cleaning.setStatus("belum menikah");
            Cleaning.setGaji(3_000_000);
            Cleaning.setJamkerja(6);
            Cleaning.setBonus(400_000);
            Cleaning.setPotongan(0);
            int jumlah = Cleaning.getgaji() + Cleaning.getbonus() - Cleaning.getpotongan();

            System.out.println("=========================================");
            System.out.println("Nama anda: " +Cleaning.getnama());
            System.out.println("Jabatan anda: "+Cleaning.getjabatan());
            System.out.println("Status anda: "+Cleaning.getstatus());
            System.out.println("Gaji anda: "+Cleaning.getgaji());
            System.out.println("jam kerja anda: "+Cleaning.getjamkerja());
            System.out.println("=========================================");
            System.out.println("Total gaji anda adalah: " +jumlah);
            System.out.println("=========================================");
            System.out.println("Selamat menikmati gaji anda, dan jangan lupa untuk terus tingkatkan kinerja anda!");
} else {
            System.out.println("Mohon maaf tolong masukkan pilihan jabatan anda dengan benar");
}
}
}