package visitor;

public class HeightlightOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {

        System.out.println("Highlight - Header");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Highlight - Anchor");
    }
}
