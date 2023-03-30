public class employee {
    private int nip;
    public String nama;
    public String jabatan;
    public String status;
    public int jamkerja;
    public int gaji;
    public int bonus;
    public int potongan;

public void setNama(String nama) {
    this.nama  = nama;
}
public void setJabatan(String jabatan){
    this.jabatan = jabatan;
}
public void setStatus(String status) {
    this.status = status;
}
public void setJamkerja(int jamkerja) {
    this.jamkerja = jamkerja;
}
public void setGaji(int gaji) {
    this.gaji = gaji;
}
public void setBonus(int bonus) {
    this.bonus = bonus;
}
public void setPotongan(int potongan) {
    this.potongan = potongan;
}
public String getnama (){
    return this.nama;
}
public String getjabatan (){
    return this.jabatan;
}
public String getstatus (){
    return status;
}
public int getjamkerja (){
    return this.jamkerja;
}
public int getgaji (){
    return this.gaji;
}
public int getbonus (){
    return this.bonus;
}
public int getpotongan (){
    return this.potongan;
}
}
