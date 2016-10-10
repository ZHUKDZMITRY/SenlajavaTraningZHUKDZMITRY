public class Product implements IProduct {
    private IProductPart part1;
    private IProductPart part2;
    private IProductPart part3;

    
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
        String s = "\nОчки готовы!\n\nКонструкция очков: 1) "+part1.toString()+"; "+"2) "+part2.toString()+"; "+"3) "+ part3.toString()+".";
        return s;
    }


}
