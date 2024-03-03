package StructuralPatterns.adapter;

public class BW_Filter implements Filter{

    @Override
    public void apply(Image image) {
        System.out.println("B & W Filter Applied");
    }
}
