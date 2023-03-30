public class limas extends Bangundatar {
    float sisi;
    float tinggi;

    @Override
    float volume(){{
        float volume = 1/3 * sisi * sisi * tinggi;
        System.out.println("Volume limas adalah "+volume);
        return volume;
    }}
}
