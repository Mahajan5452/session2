package command;

public class PlaceOrderCommand implements Command {
  private OrderReceiver orderReceiver;
  private String order;

  public PlaceOrderCommand(OrderReceiver orderReceiver, String order) {
    this.orderReceiver = orderReceiver;
    this.order = order;
  }

  @Override
  public void execute() {
    orderReceiver.placeOrder(order);
  }

  @Override
  public void undo() {
    orderReceiver.cancelOrder(order);
  }
}



