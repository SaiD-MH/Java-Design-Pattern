package BehaviourPatterns.strategy;

public class PngCompress implements Compressor{

    @Override
    public void compress() {
        System.out.println("Png Compress");
    }
}
