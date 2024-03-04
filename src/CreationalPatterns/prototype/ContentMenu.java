package CreationalPatterns.prototype;

public class ContentMenu {

    Component duplicate(Component component) {
        return component.clone();
    }

}
