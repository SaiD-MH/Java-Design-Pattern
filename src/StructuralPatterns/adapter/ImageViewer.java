package StructuralPatterns.adapter;

public class ImageViewer {

    private Image image;

    public ImageViewer(Image image) {
        this.image = image;
    }

    void apply(Filter filter){
        filter.apply(image);
    }
}
