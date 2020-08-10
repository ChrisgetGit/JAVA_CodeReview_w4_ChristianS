import java.util.ArrayList;
//Create a class Shop with properties:
public class Shop {

    String name;
    int ID;
    int IDCounter = 1;
    String address;
    ArrayList<Product> productsInShop1 = new ArrayList<>();


    Shop(String name, String address) {

        this.name = name;
        this.address = address;
        this.ID = IDCounter++;
        this.getProductsInShop1();

    }

// Create  a method to add products to the shop.
    public void buyForShop1(Product x){
        System.out.println(x.getProductQuantity()+" " + x.getProductName() + " where added to the " + this.getName() + "-SuPeR ShOp!" );
        productsInShop1.add(x);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Product> getProductsInShop1() {
        return productsInShop1;
    }

    public void setProductsInShop1(ArrayList<Product> productsInShop1) {
        this.productsInShop1 = productsInShop1;
    }
}

  /*for (Product any : productsInShop1) {

            }
  if (any.getProductName().equals(x.getProductName())) {
        any.setProductQuantity(any.getProductQuantity() + x.getProductQuantity());
        try {
        if (any.getProductQuantity() >= 15) {
        throw new StockException("Would overvill Stock");
        }
        productsInShop1.add(new Product(any.getProductName(), any.getProductDescription(), any.getProductQuantity(), any.getProductPrice()));
        System.out.println(x + "has been added to shop");
        } catch (StockException e1) {
        System.out.println(e1.getMessage());
        }


        } else {*/

