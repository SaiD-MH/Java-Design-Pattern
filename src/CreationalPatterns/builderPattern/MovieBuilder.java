package CreationalPatterns.builderPattern;

public class MovieBuilder implements PresentationBuilder{


    private MovieDocument movieDocument = new MovieDocument();
    @Override
    public void addSlide(Slide slide) {
        movieDocument.addFrame(slide.getText());
    }

    public MovieDocument getMovie() {
        return movieDocument;
    }
}
