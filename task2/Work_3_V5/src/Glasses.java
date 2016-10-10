public class Glasses{
    public static void main(String[] args) {
    
        Product product = new Product();

        AssemblyLine assemblyLine = new AssemblyLine(new CarcassLineStep(), new LensesLineStep(), new BracketLineStep());
        assemblyLine.assembleProduct(product);
        System.out.println(product);

    }
}
