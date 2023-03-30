public class balok extends Bangundatar{
    float panjang;
    float lebar;
    float tinggi;

    @Override
    float volume(){
        float volume = panjang * lebar * tinggi;
        System.out.println("volume balok adalah "+volume);
        return volume;
    }
}
