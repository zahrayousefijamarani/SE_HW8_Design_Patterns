package AbstractFactory;

public class Client {
    private AbstractGardenCreator iranianGardenCreator = new IranianGardenCreator();
    private AbstractGardenCreator japaneseGardenCreator = new JapaneseGardenCreator();

    public AbstractTree getIranianGardenTree() {
        return iranianGardenCreator.createTree();
    }

    public AbstractFlower getIranianGardenFlower() {
        return iranianGardenCreator.createFlower();
    }

    public AbstractTree getJapaneseGardenTree() {
        return japaneseGardenCreator.createTree();
    }

    public AbstractFlower getJapaneseGardenFlower() {
        return japaneseGardenCreator.createFlower();
    }
}
