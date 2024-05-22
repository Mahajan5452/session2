package command;

import java.util.ArrayList;
import java.util.List;

public class OrderReceiver {
  private List<String> orders = new ArrayList<>();

  public void placeOrder(String order) {
    orders.add(order);
    System.out.println("Order placed: " + order);
    System.out.println("Current orders: " + orders);
  }

  public void cancelOrder(String order) {
    orders.remove(order);
    System.out.println("Order canceled: " + order);
    System.out.println("Current orders: " + orders);
  }
}

