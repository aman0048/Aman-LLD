package designPatterns.factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform){
        switch (supportedPlatform){
            case IOS:
                return new IosFactory();
            case ANDROID:
                return new AndroidFactory();
            case MAC:
                return new MacFactory();
        }
        return null;
    }
}
