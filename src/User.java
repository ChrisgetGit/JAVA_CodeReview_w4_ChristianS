import java.util.ArrayList;


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
    ArrayList <Product> purchaseHistory = new ArrayList<>();

    public User(String firstName, String lastName, String eMail, String address, String zip, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.address = address;
        this.zip = zip;
        this.phone = phone;
        this.Id = IdCounter++;
        

    }
//user buy with exception and warning for shop-employees and filling users purchase History
    public void buyForUser (Shop shop , String product, int quantity) throws StockException{

        for (Product i : shop.getProductsInShop1()) {
            if (i.getProductName().equals(product)) {
                try {
                    if ( 5>=i.getProductQuantity() - quantity && i.getProductQuantity() - quantity>0) {
                        System.out.println("\n"+ firstName + " " +lastName + " has bought "+ quantity +" " + product);
                        System.out.println("Attention: There are less than 5 pieces of " + product + " left");
                    int productQuant = i.getProductQuantity() - quantity;
                    purchaseHistory.add(new Product(i.getProductName(), i.productDescription, quantity, i.productPrice));
                    i.setProductQuantity(productQuant);
                    }

                    else if (i.getProductQuantity() - quantity < 0){
                        throw new StockException (this.getFirstName() + " " + this.getLastName() + " tried to buy " + product + " but there are not enough items in stock");
                    }

                    else
                        { int productsLeft = i.getProductQuantity() - quantity;
                        purchaseHistory.add(new Product(i.getProductName(), i.productDescription, quantity, i.productPrice));
                        i.setProductQuantity(productsLeft);
                            System.out.println("\n"+ firstName + " " +lastName + " has bought "+ quantity +" " + product);}
                    break;} catch (StockException e) {
                    System.out.println(e.getMessage());
                }
                }

        }
    }

    public int getId() {
        return Id;
    }

    public ArrayList<Product> getPurchaseHistory() {
        return purchaseHistory;
    }
   public void purchaseHist (){
        if (purchaseHistory.isEmpty()){
            System.out.println("\n" + getFirstName() + " hasn't bought anything so far!");
        }else
       System.out.println("\n"+this.getFirstName()+" "+ this.getLastName() + " has bought up to now: \n" + this.getPurchaseHistory());
   }
    public void setPurchaseHistory(ArrayList<Product> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
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