
public class DependencyCreation {
 
	private Notification n;
	
	public Notification lookup(String str) {
		
		if(str.equalsIgnoreCase("EMAIL")) {
			this.n = new EmailNotificationImpl();
		}else if(str.equalsIgnoreCase("SMS")) {
			this.n = new SMSNotificationImpl();
		}else {
			this.n = new PushNoticiatonImpl();
		}
		
		return this.n;
	}
}
