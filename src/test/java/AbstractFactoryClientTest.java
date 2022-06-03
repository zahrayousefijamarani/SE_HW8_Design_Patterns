import AbstractFactory.*;
import org.junit.Test;
import AbstractFactory.Client;

import static org.junit.Assert.assertTrue;

public class AbstractFactoryClientTest {
    private Client client = new Client();

    @Test
    public void getIranianGardenTreeTest() {
        AbstractTree createdIranianTree = client.getIranianGardenTree();
        assertTrue(createdIranianTree instanceof Chenar);
    }

    @Test
    public void getIranianGardenFlower() {
        AbstractFlower createdIranianFlower = client.getIranianGardenFlower();
        assertTrue(createdIranianFlower instanceof Khatmi);
    }

    @Test
    public void getJapaneseGardenTreeTest() {
        AbstractTree createdJapaneseTree = client.getJapaneseGardenTree();
        assertTrue(createdJapaneseTree instanceof J1);
    }

    @Test
    public void getJapaneseGardenFlower() {
        AbstractFlower createdJapaneseFlower = client.getJapaneseGardenFlower();
        assertTrue(createdJapaneseFlower instanceof G1);
    }
}
