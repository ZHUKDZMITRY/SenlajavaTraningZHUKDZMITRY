/**
 * Created by User on 05.10.2016.
 */
public class Product implements IProduct {
    private IProductPart part1;
    private IProductPart part2;
    private IProductPart part3;

    public Product(){
        System.out.println("Созданна заготовка продукта");
    }

    @Override
    public void installFirstPart(IProductPart part) {
        part1 = part;
    }

    @Override
    public void installSecondPart(IProductPart part) {
        part2 = part;
    }

    @Override
    public void installThirdPart(IProductPart part) {
        part3 = part;
    }
    public String toString(){
        String s = "Продукт собран!\nПродукт содержит:\n1) "+part1.toString()+"\n"+"2) "+part2.toString()+"\n"+"3) "+ part3.toString();
        return s;
    }

}
