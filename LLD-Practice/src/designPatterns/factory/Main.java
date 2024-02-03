package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.MAC);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();
        Menu menu = uiFactory.createMenu();
    }
}
