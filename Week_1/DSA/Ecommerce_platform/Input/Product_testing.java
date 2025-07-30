package Ecommerceplatform;
import java.util.Arrays;
import java.util.Comparator;

public class Product_searching {

    static Product linearsearch(Product[] items, String name) {
        for(Product p:items) {
            if (p.Name.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    static Product binarysearch(Product[] items, String name) {
        int left = 0, right = items.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = items[mid].Name.compareToIgnoreCase(name);
            if (compare == 0) return items[mid];
            else if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Mobile", "Electronics"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Bag", "Travel")
        };

        Product res1 = linearsearch(products, "Watch");
        System.out.println(res1 != null ? "Found (Linear): " + res1.tostring() : "Not Found (Linear)");

        Arrays.sort(products, Comparator.comparing(p -> p.Name.toLowerCase()));
       
        Product res2 = binarysearch(products, "Mobile");
        System.out.println(res2 != null ? "Found (Binary): " + res2.tostring() : "Not Found (Binary)");
    }
}
