import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Design a simple menu

public class UserInterface {

    boolean goOn = true;

    public void userInterface(HashMap<Integer, ArrayList<Product>> productsHMap) {
        System.out.println("\n_____WELCOME TO THE SuPeR SHOP_____");

        while (goOn) {
            System.out.printf("CHOOSE:\nMenu: 1.Display all products%n%42s %n%43s %n%41s %n%13s ", "2.Display all products of category x", "3.Display all products were stock < 5", "4.Display all products out of stock",  "0.Exit\n");

            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();

            switch (userInput) {

                case 0:
                    System.out.println("Exit, thanks for visiting SuPeR SHOP!");
                    goOn = false;
                    break;

                case 1:
                    System.out.println("***LIST OF ALL Products***");
                    for (int i : productsHMap.keySet()) {
                        if (i == 1) {
                            System.out.println("T-Shirts" + productsHMap.get(i));
                        }
                        if (i == 2) {
                            System.out.println("Jeans" + productsHMap.get(i));
                        }
                        if (i == 3) {
                            System.out.println("Shoes" + productsHMap.get(i));
                        }
                    }
                    break;


                case 2:
                    System.out.println("Which category?\n1.T-Shirts\n2.Jeans\n3.Shoes");
                    Scanner scan1 = new Scanner(System.in);
                    int userInput2 = scan1.nextInt();

                    switch (userInput2) {
                        case 1:
                            System.out.println("All T-Shirts in Stock: " +productsHMap.get(1));
                            break;
                        case 2:
                            System.out.println("All Jeans in Stock: " +productsHMap.get(2));
                            break;
                        case 3:
                            System.out.println("All Shoes in Stock: " +productsHMap.get(3));
                            break;
                    }
                    break;

                case 3:



            }
        }
    }
}




/*

(10) Design a simple menu, where the user is able to perform certain actions

It can look something like this:

(5) Create a class Product with properties:

    productId

    productName

    productDescription

    productQuantity (max. 15)

    productPrice

    productCategory (enum class suggested here).*/

/*Think about categories like: T-Shirts, Trousers, Shirts, Jackets, Accessoires etc.

Feel free to expand here as well.

(5) Create  a method to add products to the shop.

Demonstrate the usage of this method.

Create dummy/test data in your main().

Add products to a HashMap products in your main().

(5) Create a class Shop with properties:

    name

    address

This shop should hold all products - it’s up to you to decide which data structure you want to use here.

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

(You don’t need to solve this through the menu, just display your solution by calling the method(s)).

(20) Display the purchase process, with a few examples, in your main() to prove everything works accordingly.

(10) Find a solution for the following problems: if the stock of a product gets below 5 it should inform the staff about that.

If one of the staff members trys to add a product to the shop but the stock is already full it should throw a custom exception - StockLimitReachedException.

Display solution.

(15) Extend your menu to show all users registered to the shop in a nicely formatted way.

How are the Shop and User class connected?

Find a solution.



Bonus:

(20) Create a method printReport(), which creates an external file “report.txt”, which displays the purchase history of a certain user in a nicely formatted way.


 */