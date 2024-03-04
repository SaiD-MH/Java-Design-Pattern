package CreationalPatterns.builderPattern;

public class Main {

    public static void main(String[] args) {


        Presentation presentation  = new Presentation();

        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var pdf = new MovieBuilder();
        presentation.export(pdf);

        var PDF  = pdf.getMovie();



    }
}
