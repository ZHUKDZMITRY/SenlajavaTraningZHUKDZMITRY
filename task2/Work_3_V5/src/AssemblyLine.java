public class AssemblyLine implements IAssemblyLine {
    private IProductPart firstPart;
    private IProductPart secondPart;
    private IProductPart thirdPart;

    public AssemblyLine(ILineStep step1,ILineStep step2,ILineStep step3){
    	System.out.println("Процесс создания очков.\n\n1)Изготовление деталей для сборки: ");
        firstPart = step1.buildProductPart();
        secondPart = step2.buildProductPart();
        thirdPart = step3.buildProductPart();
    }

    @Override
    public IProduct assembleProduct(IProduct product) {
        System.out.println("\n2)Сборка изготовленных деталей:");
        product.installFirstPart(firstPart);
        System.out.println(firstPart.toString()+" зафиксирован.");
        product.installSecondPart(secondPart);
        System.out.println(secondPart.toString()+" вставлены.");
        product.installThirdPart(thirdPart);
        System.out.println(thirdPart.toString()+" привинчены.");
        return product;
    }
}
