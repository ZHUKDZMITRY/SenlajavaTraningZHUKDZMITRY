/**
 * Created by User on 05.10.2016.
 */
public class Frame implements IProductPart {
    private String name = "frame";

    public Frame(){
        System.out.println("Созданна оправа");
    }

       public String toString(){
        return "Оправа";
    }
}
