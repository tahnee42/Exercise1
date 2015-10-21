
public class HelloUser {
	
	public String userName;
	
	public HelloUser() {
		userName = "";
		
	}
	public HelloUser(String name) {
		if (!name.isEmpty()) {
			this.userName = name;
		} else {
			return;
		}
		
	}
	
	public void greetUser() {
		
		System.out.printf("Hello %s!  \n", userName);

	}
	
	public void setUserName(String name) {
		
		this.userName = name;

	}
	
	public String getUserName() {
		
		return this.userName;

	}

}
