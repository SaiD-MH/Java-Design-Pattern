package BehaviourPatterns.mediator.usingObserver;


public class ArticleDialogBox {

    ListBox articleListBox = new ListBox();
    TextBox titleTextBox = new TextBox();
    Button saveButton = new Button();

    public ArticleDialogBox() {
        articleListBox.add(this::articleListBoxChanged);
        titleTextBox.add(this::titleTextBoxChanged);
    }


    public void simulation(){

        articleListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Art 2");

        System.out.println("Title : " + titleTextBox.getContent());
        System.out.println("Button : " + saveButton.getEnable());

    }

    private void titleTextBoxChanged() {

        String content = titleTextBox.getContent();

        Boolean empty = content == null || content.isEmpty();

        saveButton.setEnable(!empty);

    }

    private void articleListBoxChanged() {

        titleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnable(true);

    }
}
