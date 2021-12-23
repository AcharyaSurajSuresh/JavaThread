package thread.com;


public class ThreadFour extends Employee implements Runnable {

	public static void main(String[] args) {
		ThreadFour tf1=new ThreadFour();
		Thread t1=new Thread(tf1);
		t1.start();
		t1.setName("t1");
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println(name+" : "+i);
		}
	}
}

class Employee{
	String name="suraj";
	
}