package designPatterns.factory;

import designPatterns.factory.UIFactory;
import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.button.IosButton;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.dropdown.IosDropDown;
import designPatterns.factory.components.menu.IosMenu;
import designPatterns.factory.components.menu.Menu;

public class IosFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }
}
