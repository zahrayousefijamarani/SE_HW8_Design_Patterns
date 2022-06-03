package Prototype;

public class ConcreteClass1 implements Prototype {
    private int intField;
    private String stringField;

    public ConcreteClass1(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    public int getIntField() {
        return intField;
    }

    public String getStringField() {
        return stringField;
    }

    public Prototype cloneObject() {
        return new ConcreteClass1(this.intField, this.stringField);
    }
}
