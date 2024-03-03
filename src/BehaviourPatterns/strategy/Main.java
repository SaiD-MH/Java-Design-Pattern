package BehaviourPatterns.strategy;

public class Main {

    public static void main(String[] args) {


        ImageStorage imageStorage = new ImageStorage(

        );


        imageStorage.store(new JpegCompress() , new HighContrastFilter());
        imageStorage.store(new PngCompress(), new HighContrastFilter());

    }
}
