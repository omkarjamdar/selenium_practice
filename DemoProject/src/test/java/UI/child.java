package UI;

public class child extends parent {
	child()
	{
		super();
	}
	
	void display()
	{
		super.driver.get("https://www.makemytrip.com");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.display();
	}

}
