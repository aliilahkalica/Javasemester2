public class Warmblood extends vertebrates{
    
    Warmblood(){
        setJenis("Warmblooded");
    }

    public void setSuku(String suku) {
        if (suku.equalsIgnoreCase("mammals")){
            System.out.println("mammals animal is "+this.mammals);
        } else if (suku.equalsIgnoreCase("birds")){
            System.out.println("birds animal is "+this.birds);
        } else {
            System.out.println("pilihan anda tidak ditemukan");
        }

    }
}
