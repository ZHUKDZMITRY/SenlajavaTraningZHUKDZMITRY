/**
 * Created by User on 05.10.2016.
 */
public class Run{
    public static void main(String[] args) {
        IProductPart frame = new Frame();
        IProductPart earpiece = new Earpiece();
        IProductPart lenses = new Lenses();

        Product product = new Product();

        ILineStep lineStep1 = new AddPart(frame);
        ILineStep lineStep2 = new AddPart(earpiece);
        ILineStep lineStep3 = new AddPart(lenses);

        AssemblyLine assemblyLine = new AssemblyLine(lineStep1, lineStep2, lineStep3);

        assemblyLine.assembleProduct(product);
        System.out.println(product);

    }
}
