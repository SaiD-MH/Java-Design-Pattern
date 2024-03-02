package visitor;

public class PlainTextOperation implements Operation{

    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("PlainText - Heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("PlainText - Anchor");
    }
}
