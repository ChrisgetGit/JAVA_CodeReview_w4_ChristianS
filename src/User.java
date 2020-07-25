import java.util.ArrayList;
import java.util.HashMap;

//Create a class User with properties:
public class User {
    int Id;
    static int IdCounter = 1;
    String firstName;
    String lastName;
    String eMail;
    String address;
    String zip;
    String phone;

    public User(String firstName, String lastName, String eMail, String address, String zip, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.address = address;
        this.zip = zip;
        this.phone = phone;
        this.Id = IdCounter++;

    }
//user buy with exception and warning for shop-employes and filling users purchase History
    public void buyForUser (HashMap<Integer, Product> productHashMap, String product, int quantity, ArrayList<Product> purchaseHist) throws StockException{

        for (Integer i : productHashMap.keySet()) {
            if (productHashMap.get(i).getProductName().equals(product)) {
                try {
                    if ( 5>=productHashMap.get(i).getProductQuantity() - quantity && productHashMap.get(i).getProductQuantity() - quantity>0) {
                        System.out.println("\nBecause " + firstName + " " +lastName + " has bought "+quantity +" " +product + " products:");
                        System.out.println("Attention: There are less than 5 products of " + product + " left");
                    int productQuant = productHashMap.get(i).getProductQuantity() - quantity;
                    purchaseHist.add(new Product(productHashMap.get(i).getProductName(), productHashMap.get(i).getProductDescription(), quantity, productHashMap.get(i).getProductPrice()));
                    productHashMap.get(i).setProductQuantity(productQuant);
                    }

                    else if (productHashMap.get(i).getProductQuantity() - quantity < 0){
                        throw new StockException ("Not enough items in stock");
                    }

                    else
                        { int productQuantity = productHashMap.get(i).getProductQuantity() - quantity;
                        purchaseHist.add(new Product(productHashMap.get(i).getProductName(), productHashMap.get(i).getProductDescription(), quantity, productHashMap.get(i).getProductPrice()));
                        productHashMap.get(i).setProductQuantity(productQuantity);
                            System.out.println(firstName + " " +lastName + " has bought "+quantity +" " +product + "products\n");}
                    break;} catch (StockException e) {
                    System.out.println(firstName + " " +lastName + " tried to buy "+quantity +" " +product + "products");
                    System.out.println(e.getMessage());
                }
                }

        }
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public static int getIdCounter() {
        return IdCounter;
    }

    public static void setIdCounter(int idCounter) {
        IdCounter = idCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}











/*
    public void userbuy(ArrayList<Product> productsInShop1, String product, int quantity){


        }

        while(listItr.hasNext())
            productsInShop1.get(listItr.nextIndex());


        for (int name : productsInShop1.size()){


        }
        purchaseHistory.add(


    }


/*

(5) Create a class User with properties:

        Id

        firstName

        lastName

        eMail

        address

        zip

        phone

        …

        Create a few users and add them to a HashMap users in your main().

        (25) A user should be able to buy products from the shop, think about a solution.

        Product x gets removed from the shop and attached to the purchase history of user y. (Don't forget to reducue the stock of an item).

        (You don’t need to solve this through the menu, just display your solution by calling the method(s)).*/