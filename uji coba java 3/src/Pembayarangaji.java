import javax.management.relation.InvalidRelationIdException;

public class Pembayarangaji {
    /**
     * @param peg
     * @return
     */
    public int hitungGaji(pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof direktur)uang+=((direktur)peg).tunjangan();
        if(peg instanceof staf)uang+=((staf)peg).bonus();
            return uang;
    }
public static void main(String[] args) {
    Pembayarangaji pg = new Pembayarangaji();
    staf ali = new staf();
    direktur tony = new direktur();
    System.out.println("gaji yang dibayarkan untuk staf ="+pg.hitungGaji(ali));
    System.out.println("gaji yang dibayarkan kepada direktur=" +pg.hitungGaji(tony));
    
}
}

