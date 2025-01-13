package day5.labexam;
import  java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MerchandiseInventoryTest {
    public static void main(String[] args) {

        ArrayList<Merchandise> inventory = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("inputData.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                String itemCode = data[0];
                int quantity = Integer.parseInt(data[1]);
                double unitPrice = Double.parseDouble(data[2]);

                Merchandise merchandise = new Merchandise(itemCode, quantity, unitPrice);
                inventory.add(merchandise);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sorting by itemCode in ascending order


        Collections.sort(inventory, new Comparator<Merchandise>() {
            @Override
            public int compare(Merchandise m1, Merchandise m2) {
                return m1.getItemCode().compareTo(m2.getItemCode());
            }
        });

        System.out.println("Sorted by item code (ascending):");
        for (Merchandise merchandise : inventory) {
            System.out.println(merchandise);
        }

        // Sorting by unitPrice in descending order

        Collections.sort(inventory, new Comparator<Merchandise>() {
            @Override
            public int compare(Merchandise m1, Merchandise m2) {
                return Double.compare(m2.getUnitPrice(), m1.getUnitPrice()); // Descending order
            }
        });

        System.out.println("\nSorted by price (descending):");
        for (Merchandise merchandise : inventory) {
            System.out.println(merchandise);
        }

    }

}
