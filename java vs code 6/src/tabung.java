public class tabung extends Bangundatar {
    float r;
    float tinggi;

    @Override
    float volume (){
        float volume = (float)(Math.PI)* r * r *tinggi;
        System.out.println("volume tabung adalah "+volume);
        return volume;
    }
}
