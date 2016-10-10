/**
 * Created by User on 05.10.2016.
 */
public class Lenses implements IProductPart {
    private String name = "lenses";

    public Lenses(){
        System.out.println("Созданны Линзы");
    }
    public String toString(){
        return "Линзы";
    }
}
