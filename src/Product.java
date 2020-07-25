

//Create a class Product with properties:

public class Product {

    int productID;
    static int productIDUpper=0;
    String productName;
    String productDescription;
    int productQuantity;        //(max. 15)
    double productPrice;
    int productCategory;



    public Product(String productName, String productDescription, int productQuantity, double productPrice) {
        this.productID = productIDUpper++;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;


    }

    @Override
    public String toString() {
        return
                "\nproductID = " + productID +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productQuantity=" + productQuantity +
                ", productPrice=" + productPrice +
                ", productCategory=" + productCategory;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(int productCategory) {
        this.productCategory = productCategory;
    }
}


/*{(5) Create a class Product with properties:

        productId

        productName

        productDescription

        productQuantity (max. 15)

        productPrice

        productCategory (enum class suggested here).

        Think about categories like: T-Shirts, Trousers, Shirts, Jackets, Accessoires etc.

        Feel free to expand here as well.

*/
