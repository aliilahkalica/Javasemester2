public class kubus extends Bangundatar {
    float sisi;

    @Override
    float volume(){
        float volume = sisi * sisi * sisi;
        System.out.println("volume kubus adalah " +volume);
        return volume;
    }

}


