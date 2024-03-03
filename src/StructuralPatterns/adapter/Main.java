package StructuralPatterns.adapter;

public class Main {
    public static void main(String[] args) {

        ImageViewer imageViewer = new ImageViewer(new Image());


        imageViewer.apply(new BW_Filter());
        imageViewer.apply(new ThirdPartFilterAdapter(new ThirdPartyFilter()));


    }
}
