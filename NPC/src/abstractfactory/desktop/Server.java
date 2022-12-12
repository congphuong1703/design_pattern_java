package abstractfactory.desktop;

public class Server implements Desktop {

    @Override
    public int getRam() {
        return 32;
    }
}
