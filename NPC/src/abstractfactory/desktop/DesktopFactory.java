package abstractfactory.desktop;

import abstractfactory.ComputerAbstractFactory;

public class DesktopFactory implements ComputerAbstractFactory<Desktop> {

    private static final String FULL_SIZE = "Full Size";
    private static final String GAMING = "Gaming";
    private static final String SERVER = "Server";

    public DesktopFactory() {

    }

    public Desktop getInstance(String type) {
        switch (type) {
            case SERVER:
                return new Server();
            case FULL_SIZE:
                return new FullSize();
            case GAMING:
                return new Gaming();
            default:
                throw new IllegalArgumentException("This Desktop is unsupported");
        }
    }
}
