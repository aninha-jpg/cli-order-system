import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enumsentities.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



public class Program {
    public static void main(String[] args) throws ParseException{
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
       
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       
            System.out.println("Enter Cliente Data: ");
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Birthday Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());

            Client client = new Client(name, email, date);

            System.out.println("Enter order data: ");
            System.out.print("Status: ");
            OrderStatus status = OrderStatus.valueOf(sc.next());

            Order order = new Order(status, new Date(), client);

            System.out.print("How many items to this order?");
            int n = sc.nextInt();

            for(int i = 0; i<n; i++){
                System.out.println("Enter #" + (i+1) + " item data: ");

                System.out.print("Product name: ");
                sc.nextLine();
                String nameProduct = sc.nextLine();
                System.out.print("Product price: ");
                Double price = sc.nextDouble();
                System.out.print("Quantity: ");
                Integer quantity = sc.nextInt();


                Product product = new Product(nameProduct, price);

                OrderItem item = new OrderItem(quantity, price, product);

                order.addItems(item);


            }
            System.out.println();
            System.out.println(order);

        }
    }
}
