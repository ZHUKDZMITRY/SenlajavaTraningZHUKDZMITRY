
public class BracketLineStep implements ILineStep{

	@Override
	public IProductPart buildProductPart() {
		return new Bracket();
	}
	

}
