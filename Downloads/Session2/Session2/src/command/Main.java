package command;

public class Main {
  public static void main(String[] args) {
    OrderReceiver orderReceiver = new OrderReceiver();
    CommandManager manager = new CommandManager();

    Command orderPizza = new PlaceOrderCommand(orderReceiver, "Pizza");
    Command orderBurger = new PlaceOrderCommand(orderReceiver, "Burger");
    Command cancelPizza = new CancelOrderCommand(orderReceiver, "Pizza");
    manager.executeCommand(orderPizza);
    manager.executeCommand(orderBurger);
    manager.undo();
  }
}
