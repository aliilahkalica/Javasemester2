public class kerucut extends Bangundatar {
    float r;
    float tinggi;

    @Override
    float volume(){
        float volume = 1/3 * (float)(Math.PI) * r * r * tinggi;
        System.out.println("volume kerucut adalah "+volume);
        return volume;
    }
}
