
public class CarcassLineStep implements ILineStep {
	
	@Override
	public IProductPart buildProductPart() {
		return new Carcass();
	}

}
