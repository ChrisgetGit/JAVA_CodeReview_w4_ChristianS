public class Shoes extends Product{

    public Shoes(String productName, String productDescription, int productQuantity, double productPrice) {
        super(productName, productDescription, productQuantity, productPrice);
        setProductCategory(2);
    }
}


