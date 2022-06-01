package AbstractFactory;

public class IranianGardenCreator extends AbstractGardenCreator {
    public AbstractTree createTree() {
        return new Chenar();
    }

    public AbstractFlower createFlower() {
        return new Khatmi();
    }
}
