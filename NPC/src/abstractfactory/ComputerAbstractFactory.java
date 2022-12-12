package abstractfactory;

public interface ComputerAbstractFactory<T> {

    T getInstance(String type);
}
