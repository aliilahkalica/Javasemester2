public class vertebrates {
    public static String mammals = "bear, tiger, whale";
    public static String birds = "ostrich, peacock, eagle";
    public static String fish = "Salmon, Goldfish, Guppy";
    public static String reptiles = "Turtle, Crocodile, Snake";
    public static String amphibians = "Frog, Toad, Newt";

    public String jenis;
    public String suku;

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public void setSuku(String suku){
        this.suku = suku;
    }
    public String getjenis(){
        return this.jenis;
    }
    public String getsuku(){
        return this.suku;
    }
}
