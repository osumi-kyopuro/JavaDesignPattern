package Prototype;
import Prototype.framework.*;
public class UnderlinePen implements Product{
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("" + s + "");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.print("");
    }

    public Product createClone() {
        Product p = null;
        try{
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
