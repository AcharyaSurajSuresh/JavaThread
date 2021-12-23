package thread.com;

public class ThreadOne extends Thread{

	public static void main(String[] args) {
		ThreadOne t1=new ThreadOne();
		ThreadOne t2=new ThreadOne();
		t1.start();
		t1.setName("d1");
		t2.start();
		t2.setName("d2");
	}
	public void run()
	{
		System.out.println("working!!!");
		System.out.println(currentThread().getName());
		for(int i=1;i<=50;i++)
			System.out.println(i);
	}

}
