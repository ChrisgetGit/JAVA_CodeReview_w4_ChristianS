# JAVA_CodeReview_w4_Christian_Sander

(5) Create a class Product with properties:

    productId

    productName

    productDescription

    productPrice

    productCategory (enum class suggested here).

A product can only have a max. stock of 15 items.

Think about categories like: T-Shirts, Trousers, Shirts, Jackets, Accessoires etc.

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

 
