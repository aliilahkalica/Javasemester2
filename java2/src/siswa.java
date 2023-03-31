import java.util.Scanner;

public class siswa {
    public String nama;
    public Int absen;
    private Int nilai;
    public Int kelas;

    public void siswa() {
        System.out.println("Nama siswa = "+nama);
        System.out.println("Absen siswa = "+absen);
        System.out.println("nilai siswa = "+nilai);
        System.out.println("kelas siswa = "+kelas);
    }
    public void setNama(String nama, Int absen, Int nilai, Int kelas) {
        this.nama = nama;
        this.absen = absen;
        this.nilai = nilai;
        this.kelas = kelas;
    }
    public void getNama() {
        return this.nama;
        
    }
    
    }
