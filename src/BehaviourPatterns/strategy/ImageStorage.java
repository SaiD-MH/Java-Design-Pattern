package BehaviourPatterns.strategy;

public class ImageStorage {

    private Compressor compressor;
    private Filter filter;


    public void compress() {
        compressor.compress();
    }


    public void filter() {
        filter.apply();
    }

    public void store(Compressor compressor, Filter filter) {
        this.filter = filter;
        this.compressor = compressor;

        compress();
        filter();
    }

}
