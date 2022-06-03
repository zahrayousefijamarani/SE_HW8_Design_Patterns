import AbstractFactory.*;
import Prototype.Prototype;
import org.junit.Test;
import Prototype.Client;
import Prototype.ConcreteClass1;
import Prototype.ConcreteClass2;
import static org.junit.Assert.*;

public class PrototypeClientTest {
    private Client client = new Client();
    private ConcreteClass1 concreteClass1 = new ConcreteClass1(10, "Abbas");
    private ConcreteClass2 concreteClass2 = new ConcreteClass2(1.34, "Amir");

    @Test
    public void operationConcreteClass1InputTest() {
        Prototype copiedConcreteClass1 = client.operation(concreteClass1);
        if (copiedConcreteClass1 instanceof ConcreteClass1) {
            assertEquals(((ConcreteClass1) copiedConcreteClass1).getIntField(), concreteClass1.getIntField());
            assertEquals(((ConcreteClass1) copiedConcreteClass1).getStringField(), concreteClass1.getStringField());
        }
    }

    @Test
    public void operationConcreteClass2InputTest() {
        Prototype copiedConcreteClass2 = client.operation(concreteClass2);
        if (copiedConcreteClass2 instanceof ConcreteClass2) {
            assertEquals(((ConcreteClass2) copiedConcreteClass2).getDoubleField(), concreteClass2.getDoubleField(), 0.1);
            assertEquals(((ConcreteClass2) copiedConcreteClass2).getStringField(), concreteClass2.getStringField());
        }
    }
}
