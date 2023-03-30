public class bola extends Bangundatar {
    float r;

    @Override
    float volume(){
        float volume = 4/3 * (float)(Math.PI) * r * r * r;
        System.out.println("volume bola adalah "+volume);
        return volume;
    }
    
}
