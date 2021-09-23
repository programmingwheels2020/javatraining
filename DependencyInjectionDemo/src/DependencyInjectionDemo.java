
public class DependencyInjectionDemo {

	public static void main(String[] args) {
		DependencyCreation dc = new DependencyCreation();
		
		Notification n = dc.lookup("Email");
		Order order = new Order(n);
		order.sendNotifiction();
		n = dc.lookup("SMS");
		order.setNotification(n);
		order.sendNotifiction();
		
		//spring framework
	}

}
