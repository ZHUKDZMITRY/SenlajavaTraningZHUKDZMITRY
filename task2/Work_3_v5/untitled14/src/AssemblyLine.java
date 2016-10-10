/**
 * Created by User on 05.10.2016.
 */
public class AssemblyLine implements IAssemblyLine {
    private IProductPart firstPart;
    private IProductPart secondPart;
    private IProductPart thirdPart;

    public AssemblyLine(ILineStep step1,ILineStep step2,ILineStep step3){
        firstPart = step1.buildProductPart();
        secondPart = step2.buildProductPart();
        thirdPart = step3.buildProductPart();
    }

    @Override
    public IProduct assembleProduct(IProduct product) {
        System.out.println("Начало сборки");
        product.installFirstPart(firstPart);
        System.out.println("Вставленно: "+firstPart.toString());
        product.installSecondPart(secondPart);
        System.out.println("Вставленно: "+secondPart.toString());
        product.installThirdPart(thirdPart);
        System.out.println("Вставленно: "+thirdPart.toString());
        return product;
    }
}
