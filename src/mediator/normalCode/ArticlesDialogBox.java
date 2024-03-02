package mediator.normalCode;

public class ArticlesDialogBox extends DialogBox {

    ListBox articleListBox = new ListBox(this);
    TextBox titleTextBox = new TextBox(this);
    Button saveButton = new Button(this);



    public void simulation(){

        articleListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Art 2");

        System.out.println("Title : " + titleTextBox.getContent());
        System.out.println("Button : " + saveButton.getEnable());

    }

    @Override
    public void change(UIControl control) {

        if (control == articleListBox)
            articleListBoxChanged();
        else if (control == titleTextBox)
            titleTextBoxChanged();
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
