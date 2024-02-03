package designPatterns.factory;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme(){
        System.out.println("Setting up Flutter Theme");
    }
    public void setRefreshRate(){
        System.out.println("Setting up Flutter Refresh rate");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.getUIFactory(supportedPlatform);
    }
}
