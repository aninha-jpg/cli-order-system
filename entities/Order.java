package entities;
import enumsentities.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();


    public Order(){

    }

    public Order(OrderStatus status, Date moment, Client client) {
        this.status = status;
        this.moment = moment;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItems(OrderItem item){
        items.add(item);
    }

    public void removeItems(OrderItem item){
        items.remove(item);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double totalPrice(){
        Double soma = 0.0;
        for(OrderItem i: items){
            soma += i.subTotal();
        }
        return soma;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMARY: \n");
        sb.append("Order Moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order Status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order Items: \n");
        for(OrderItem i: items){
            sb.append(i + "\n");
        }
        sb.append("Total Price: $");
        sb.append(String.format("%.2f", totalPrice()));
        return sb.toString();
    }
}
