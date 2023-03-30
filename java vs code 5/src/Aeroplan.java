public class Aeroplan extends vehicle {
    public void walk() {
        System.out.println("Aeroplan sedang terbang");
    }
    public static void main() {
        Aeroplan garuda = new Aeroplan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
