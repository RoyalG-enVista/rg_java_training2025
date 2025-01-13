package day5.labexam;
import  java.util.*;
public class Merchandise {

    private final String itemCode;
    private final int quantity;
    private final double unitPrice;

    public Merchandise(String itemCode, int quantity, double unitPrice) {
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {

        return  itemCode + " " + quantity + " " + unitPrice;
    }
}
