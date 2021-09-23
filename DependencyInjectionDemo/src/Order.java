
public class Order {

	private Notification notification;
	
	public Order(Notification n) {
		this.notification = n;
	}
	
	public void setNotification(Notification n) {
		this.notification=n;
	}
	
	public void sendNotifiction() {
		this.notification.notifyOrder();
	}
}
