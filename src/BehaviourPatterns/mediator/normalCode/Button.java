package BehaviourPatterns.mediator.normalCode;

public class Button extends UIControl{
    private Boolean isEnable;
    public Button(DialogBox owner) {
        super(owner);
    }


    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }
}
