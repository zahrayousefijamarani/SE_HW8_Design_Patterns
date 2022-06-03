import AbstractFactory.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class IranianGardenCreatorTest {
    private IranianGardenCreator iranianGardenCreator = new IranianGardenCreator();

    @Test
    public void createTreeTest() {
        AbstractTree createdTree = iranianGardenCreator.createTree();
        assertTrue(createdTree instanceof Chenar);
    }

    @Test
    public void createFlowerTest() {
        AbstractFlower createdFlower = iranianGardenCreator.createFlower();
        assertTrue(createdFlower instanceof Khatmi);
    }
}
