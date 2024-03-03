package StructuralPatterns.decorator;

public class CompressStream implements Stream {

    private Stream stream;

    public CompressStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {

        var comp = data.substring(0, 4);
        stream.write(comp);


    }
}
