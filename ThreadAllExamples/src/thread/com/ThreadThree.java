package thread.com;
public class ThreadThree extends Thread{
	public static void main(String[] args) {
		ThreadThree t1=new ThreadThree();
		ThreadThree t2=new ThreadThree();
		t1.start();
		t1.setName("d1");
		t2.start();
		t2.setName("d2");
	}
	public void run()
	{
		String name=currentThread().getName();
		if(name.equals("d1"))
		{
			for(int i=1;i<=10;i++)
				try {
					sleep(2000);
					System.out.println(name+" : "+i);
				}
			catch(Exception e)
			{
				
			}
		}
		else if(name.equals("d2"))
		{
			for(int i=10;i>=1;i--)
				try {
					sleep(2000);
					System.out.println(name+" : "+i);
				}
			catch(Exception e)
			{
				
			}
		}
	}

}

