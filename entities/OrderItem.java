package entities;
import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private List<Product> products = new ArrayList<>();

    public OrderItem(){

    }

    public OrderItem(Integer quantity, Double price){
       this.quantity = quantity;
       this.price = price; 
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Double getPrice(){
        return price;
    }

    public Double subTotal(){
        return price * quantity;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
            for(Product p: products){
                sb.append(p);
            }
        sb.append("Quantity: ");
        sb.append(quantity);
        sb.append(", Subtotal: $");
        sb.append(String.format("%.2f", subTotal()));
            return sb.toString();
    }

}
