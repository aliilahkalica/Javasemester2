public class Coldblood extends vertebrates {
    
    Coldblood(){
        setJenis("Cold Blooded");
    }
    public void setSuku(String suku) {

        if(suku.equalsIgnoreCase("fish")){
            System.out.println("fish animal is "+this.fish);
        } else if (suku.equalsIgnoreCase("reptiles")){
            System.out.println("reptiles animal is "+this.reptiles);
        } else if (suku.equalsIgnoreCase("amphibians")){
            System.out.println("amphibians animal is "+this.amphibians);
        } else {
            System.out.println("pilihan anda tidak ditemukan");
        }

    }
}
