package StructuralPatterns.decorator;

public class EncryptedStream implements Stream {

    private Stream stream;

    public EncryptedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {

        var enc = "@4!-@+4!-0-0!=^&*#($^#&";
        stream.write(enc);
    }
}
