package BehaviourPatterns.strategy;

public class JpegCompress implements Compressor{

    @Override
    public void compress() {
        System.out.println("Jpeg Compressor");
    }
}
