import java.util.Scanner;

public class main  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        vertebrates Vertebrates = new vertebrates();
        System.out.println("Masukkan pilihan jenis hewan");
        System.out.println("1. Warm Blooded \n2. Cold Blooded");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan pilihan anda: ");
        String input1 = scan.nextLine().toLowerCase();

        System.out.println("");
        if (input1.equalsIgnoreCase("warm Blooded")){
            Warmblood warmblood = new Warmblood();
            System.out.println("Masukkan pilihan suku hewan");
            System.out.println("1. Mammals \n2. Birds");
            System.out.println("----------------------------");
            System.out.println("Masukkan pilihan anda: ");
            String input2 = scan.nextLine().toLowerCase();
            if (input2.equalsIgnoreCase("Mammals")){
                System.out.println("hewan mammals: "+vertebrates.mammals);
            } if (input2.equalsIgnoreCase("Birds"))
                System.out.println("hewan Birds: "+vertebrates.birds);

        } else if (input1.equalsIgnoreCase("cold Blooded")){
            System.out.println("Masukkan pilihan suku hewan");
            System.out.println("1. Fish \n2. Reptiles \n3. Amphibians ");
            System.out.println("----------------------------");
            System.out.println("Masukkan pilihan anda: ");
            String input3 = scan.nextLine().toLowerCase();
            if (input3.equalsIgnoreCase("Fish")){
                System.out.println("hewan fish: "+vertebrates.fish);
            } if (input3.equalsIgnoreCase("Reptiles")){
                System.out.println("hewan reptiles: "+vertebrates.reptiles);
            } if (input3.equalsIgnoreCase("Amphibians")){
                System.out.println("hewan Amphibians: "+vertebrates.amphibians);

            }
        

        }

}
}

