package Ecommerceplatform;
public class Product {
    int Id; // product id
    public String Name; // product name
    String category;// product's category

    public Product(int Id, String Name, String category) {
        this.Id=Id;
        this.Name=Name;
        this.category=category;
    }

    public String tostring() {
        return "ID:"+Id+",Name:"+Name+",Category:"+category;
    }
}
