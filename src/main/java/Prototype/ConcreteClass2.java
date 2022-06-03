package Prototype;

public class ConcreteClass2 implements Prototype {
    private double doubleField;
    private String stringField;

    public ConcreteClass2(double doubleField, String stringField) {
        this.doubleField = doubleField;
        this.stringField = stringField;
    }

    public double getDoubleField() {
        return doubleField;
    }

    public String getStringField() {
        return stringField;
    }

    public Prototype cloneObject() {
        return new ConcreteClass2(this.doubleField, this.stringField);
    }
}
