import java.util.ArrayList;
import java.util.HashMap;


public class Main {





    public static void main(String[] args) throws  StockException{

        Shop shop1 = new Shop("Praterstern","Praterstern 1");
        Shop shop2 = new Shop("Stefansplatz","Stefansplatz 1");

        TShirt shirt = new TShirt("Batman-Shirt","Dark Hero Style, green",15, 34);
        TShirt shirt1 = new TShirt("Superman-Shirt","Hero Style, green",10, 40);
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






//Create  a method to add products to the shop.
//Demonstrate the usage of this methode:

        shop1.buyForShop1(shirt);
        shop1.buyForShop1(shirt1);
        shop2.buyForShop1(shoes1);
        shop1.buyForShop1(jeans1);
        shop1.buyForShop1(shoes1);

        System.out.println("Products in " + shop1.getName()+" adding example: "+shop1.productsInShop1+"\n");
        System.out.println("Products in " + shop2.getName()+" adding example: "+shop2.productsInShop1+"\n");

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





        //Users buying, with exception if not enough in Stock, and Alert if less than 5 are left in Stock:
        user1.buyForUser(shop1, "Batman-Shirt", 5);
        user1.buyForUser(shop1, "Superman-Shirt", 6);
        user1.buyForUser(shop1, "Superman-Shirt", 5);

        user2.buyForUser(shop1, "Batman-Shirt", 6);
        user2.buyForUser(shop1, "Blue Jean", 8);

        user3.buyForUser(shop1, "Sneakers", 10);
        //Purchase history of Users out print:
        user1.purchaseHist();
        user2.purchaseHist();
        user3.purchaseHist();
        user4.purchaseHist();
        /*System.out.println("\nPurchase history of "+user1.getLastName() +" is "+user1.purchaseHistory);
        System.out.println("\nPurchase history of "+user2.getLastName() +" is "+user2.purchaseHistory);
        System.out.println("\nPurchase history of "+user3.getLastName() +" is "+user3.purchaseHistory);
        System.out.println("\nIn Shop after users shopping: "+inShopsHashMap);*/




        UserInterface userInterface1 = new UserInterface();
        userInterface1.userInterface(productHashMap);



    }
}
