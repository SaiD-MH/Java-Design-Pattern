package StructuralPatterns.proxy;

public class RealBook implements EBook {


    private String fileName;

    public RealBook(String fileName) {
        this.fileName = fileName;
        load(fileName);
    }

    @Override
    public void show(String fileName) {
        System.out.println("Show FileName : " + fileName);
    }

    public void load(String fileName) {
        System.out.println("Loaded : " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }


}
