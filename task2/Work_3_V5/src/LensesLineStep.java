public class LensesLineStep implements ILineStep{

	@Override
	public IProductPart buildProductPart() {
		return new Lenses();
	}

}
