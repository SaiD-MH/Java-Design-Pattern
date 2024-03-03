package StructuralPatterns.adapter;

public class ThirdPartFilterAdapter implements Filter{


    private ThirdPartyFilter filter;

    public ThirdPartFilterAdapter(ThirdPartyFilter filter) {
        this.filter = filter;
    }

    @Override
    public void apply(Image image) {

        filter.apply(image);
    }
}
