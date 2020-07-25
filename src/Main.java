import java.util.ArrayList;
import java.util.HashMap;


public class Main {





    public static void main(String[] args) throws  StockException{

        Shop shop1 = new Shop("Praterstern","Praterstern 1");

        TShirt shirt = new TShirt("Batman","Dark Hero Style, green",15, 34);
        TShirt shirt1 = new TShirt("Superman","Hero Style, green",10, 40);
        Jeans jeans1 = new Jeans("Blue Jean", "it's blue, yeah", 11, 59);
        Shoes shoes1 = new Shoes("Sneakers","Green and Trendy", 14, 79.9);


//Create a few users and add them to a HashMap users in your main():
        User user1 = new User ("Bruce", "Wayne", "bruce@wayne", "Wayne Manson 1", "1010", "0650 55 66 34");
        User user2 = new User ("Clark", "Kent", "super@man.com", "Metropolis 1", "1100", "0676 621 314 22");
        User user3 = new User("Dummy","Test","Dummy@test.com", "Dummytown 25", "1032", "0650 32 40 409");
        User user4 = new User ("Any", "Wild", "Any@Wild.com", "Anytown 42", "4242", "0699 99 449 559");
//add Users to Hashmap ser:
        HashMap<Integer, User> userHashMap = new HashMap<>();

        userHashMap.put(user1.getId(), user1);
        userHashMap.put(user2.getId(), user2);
        userHashMap.put(user3.getId(), user3);
        userHashMap.put(user4.getId(),user4);






//( Create  a method to add products to the shop.
//Demonstrate the usage of this method:
        ArrayList<Product> productsInShop1 = new ArrayList<>();

        shop1.buyForShop1(shirt, productsInShop1);
        shop1.buyForShop1(shirt1, productsInShop1);
        System.out.println("Products in Shop, adding example: "+productsInShop1+"\n");

        //Categories ArrayLists:
        ArrayList<Product> tShirtsArray = new ArrayList<>();
        ArrayList<Product> jeansArray = new ArrayList<>();
        ArrayList<Product> shoesArray = new ArrayList<>();
        //adding products to Categories ArrayLists:
        tShirtsArray.add(shirt);
        tShirtsArray.add(shirt1);
        jeansArray.add(jeans1);
        shoesArray.add(shoes1);


        //create HashMap for Categories ArrayList:
        HashMap<Integer, ArrayList<Product>> productHashMap = new HashMap<>();
        //adding Categories to Hashmap:
        productHashMap.put(tShirtsArray.get(0).getProductCategory(), tShirtsArray);
        productHashMap.put(jeansArray.get(0).getProductCategory(),jeansArray);
        productHashMap.put(shoesArray.get(0).getProductCategory(),shoesArray);


        //shops Hashmap:
        HashMap<Integer, Product> inShopsHashMap = new HashMap<>();

        inShopsHashMap.put(shirt.getProductID(), shirt);
        inShopsHashMap.put(shirt1.getProductID(), shirt1);
        inShopsHashMap.put(shoes1.getProductID(), shoes1);
        inShopsHashMap.put(jeans1.getProductID(), jeans1);

        System.out.println("Products in Shop at beginning of Users-shopping: "+inShopsHashMap);

        //purchase History of Users:
        ArrayList<Product> purchaseHistory = new ArrayList<>();
        ArrayList<Product> purchaseHistory1 = new ArrayList<>();
        ArrayList<Product> purchaseHistory2 = new ArrayList<>();

        //Users buying, with exception if not enough in Stock, and Alert if less than 5 are left in Stock:
        user1.buyForUser(inShopsHashMap, "Batman", 5, purchaseHistory);
        user1.buyForUser(inShopsHashMap, "Superman", 6, purchaseHistory);
        user1.buyForUser(inShopsHashMap, "Superman", 5, purchaseHistory);

        user2.buyForUser(inShopsHashMap, "Batman", 6, purchaseHistory1);
        user2.buyForUser(inShopsHashMap, "Blue Jean", 8, purchaseHistory1);

        user3.buyForUser(inShopsHashMap, "Sneakers", 10, purchaseHistory2);
        //Purchase history of Users out print:
        System.out.println("\nPurchase history of "+user1.getLastName() +" is "+purchaseHistory);
        System.out.println("\nPurchase history of "+user2.getLastName() +" is "+purchaseHistory1);
        System.out.println("\nPurchase history of "+user3.getLastName() +" is "+purchaseHistory2);
        System.out.println("\nIn Shop after users shopping: "+inShopsHashMap);

        UserInterface userInterface1 = new UserInterface();
        userInterface1.userInterface(productHashMap);



    }
}
