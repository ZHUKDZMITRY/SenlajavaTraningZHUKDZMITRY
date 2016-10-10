public class AssemblyLine implements IAssemblyLine {
    private IProductPart firstPart;
    private IProductPart secondPart;
    private IProductPart thirdPart;

    public AssemblyLine(ILineStep step1,ILineStep step2,ILineStep step3){
    	System.out.println("������� �������� �����.\n\n1)������������ ������� ��� ������: ");
        firstPart = step1.buildProductPart();
        secondPart = step2.buildProductPart();
        thirdPart = step3.buildProductPart();
    }

    @Override
    public IProduct assembleProduct(IProduct product) {
        System.out.println("\n2)������ ������������� �������:");
        product.installFirstPart(firstPart);
        System.out.println(firstPart.toString()+" ������������.");
        product.installSecondPart(secondPart);
        System.out.println(secondPart.toString()+" ���������.");
        product.installThirdPart(thirdPart);
        System.out.println(thirdPart.toString()+" ����������.");
        return product;
    }
}
