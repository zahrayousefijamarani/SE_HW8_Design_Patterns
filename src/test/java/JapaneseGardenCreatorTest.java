import AbstractFactory.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class JapaneseGardenCreatorTest {
    private JapaneseGardenCreator japaneseGardenCreator = new JapaneseGardenCreator();

    @Test
    public void createTreeTest() {
        AbstractTree createdTree = japaneseGardenCreator.createTree();
        assertTrue(createdTree instanceof J1);
    }

    @Test
    public void createFlowerTest() {
        AbstractFlower createdFlower = japaneseGardenCreator.createFlower();
        assertTrue(createdFlower instanceof G1);
    }
}
