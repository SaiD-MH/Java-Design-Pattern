package StructuralPatterns.proxy;

public class ProxyEBook implements EBook{

    private RealBook realBook ;
    private String fileName;

    public ProxyEBook(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show(String fileName) {

        if(realBook == null)
            realBook = new RealBook(fileName);

        realBook.load(fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
