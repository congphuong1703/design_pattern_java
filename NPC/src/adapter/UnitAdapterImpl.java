package adapter;


//Adaptee
public class UnitAdapterImpl implements UnitAdapter {

    private Television television;

    public UnitAdapterImpl(Television television) {
        this.television = television;
    }

    public UnitAdapterImpl() {
    }

    @Override
    public double getSize() {
        return convertInchToCentimeter(television.getSize());
    }

    private double convertInchToCentimeter(int inch) {
        return inch * 25.4;
    }

    private double convertFeetToCentimeter(int feet) {
        return feet * 30.48;
    }

    private double convertYardToCentimeter(int yard){
        return yard * 91.4;
    }
}
