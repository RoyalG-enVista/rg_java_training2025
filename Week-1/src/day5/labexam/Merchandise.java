package day5.labexam;
import  java.util.*;
public class Merchandise {

    private String itemCode;
    private int quantity;
    private double unitPrice;

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
