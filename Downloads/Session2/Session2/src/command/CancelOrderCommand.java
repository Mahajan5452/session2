package command;

public class CancelOrderCommand implements Command {
  private OrderReceiver orderReceiver;
  private String order;

  public CancelOrderCommand(OrderReceiver orderReceiver, String order) {
    this.orderReceiver = orderReceiver;
    this.order = order;
  }

  @Override
  public void execute() {
    orderReceiver.cancelOrder(order);
  }

  @Override
  public void undo() {
    orderReceiver.placeOrder(order);
  }
}
