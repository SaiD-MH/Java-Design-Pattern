package BehaviourPatterns.mediator.usingObserver;



public class Button extends UIControl {
    private Boolean isEnable;
    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
        notifyObservers();
    }
}
