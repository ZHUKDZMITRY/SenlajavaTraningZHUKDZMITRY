/**
 * Created by User on 05.10.2016.
 */
public class AddPart implements  ILineStep {
    private IProductPart part;
    public AddPart(IProductPart part){
        this.part = part;
    }
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Поставка "+part.toString());
        return part;
    }
}
