package StructuralPatterns.adapter;

public class ThirdPartyFilter {

    public  void init(){

    }

    public void apply(Image image){
        init();
        System.out.println("3rd - Party Filter");
    }
}
