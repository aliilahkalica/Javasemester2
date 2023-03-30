public class security extends employee {
    
    security(){
        setGaji(3000000);
    }
    public void cetak() {
        System.out.println(getgaji());
    }
    public void setStatus(String status) { 
        int bonus = 400_000;
        super.setBonus(bonus);
        super.setStatus(status);
        if (status.equalsIgnoreCase("menikah")) {
            System.out.println("Selamat kamu mendapat bonus sebesar "+bonus);
        } else {
            System.out.println("mohon maaf kamu tidak mendapat bonus");
        }
    }
    public void cetak2() {
        System.out.println(getbonus());
    }
    public void setJamkerja(int jamkerja) {
        int potongan = 20_000;
        super.setJamkerja(jamkerja);
        super.setPotongan(potongan);
        if ( jamkerja > 4 ){
            System.out.println("Selamat kamu tidak mendapatkan potongan");
    } else {
            System.out.println("Mohon maaf kamu mendapat pengurangan gaji sebesar" +potongan);
    }
}
}
