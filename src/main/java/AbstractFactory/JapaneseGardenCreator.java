package AbstractFactory;

public class JapaneseGardenCreator extends AbstractGardenCreator {
    public AbstractTree createTree() {
        return new J1();
    }

    public AbstractFlower createFlower() {
        return new G1();
    }
}
