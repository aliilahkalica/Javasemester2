public class prisma extends Bangundatar {
    float alas;
    float tinggi;
    float tinggip;

    @Override
    float volume(){
        float volume = (1/2 *alas*tinggi)*tinggip;
        System.out.println("volume prisma adalah "+volume);
        return volume;
    }
}
