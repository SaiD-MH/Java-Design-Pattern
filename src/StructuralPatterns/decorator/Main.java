package StructuralPatterns.decorator;

public class Main {


    public static void main(String[] args) {

        saveCreditCart(new EncryptedStream(new CompressStream( new CloudStream())));
    }

    private static void saveCreditCart(Stream stream) {

        stream.write("1234-1879-8000");
    }


}
