package thread.com;

public class ThreadTwo extends Thread{
	public static void main(String[] args) {
		ThreadTwo t1=new ThreadTwo();
		ThreadTwo t2=new ThreadTwo();
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
				System.out.println(name+" : "+i);
		}
		else if(name.equals("d2"))
		{
			for(int i=1;i<=10;i++)
				System.out.println(name+" : "+i);
		}
	}

}
