package fastcampuswork.thread;

class MyThread implements Runnable{

	@Override
	public void run() {
		int i;
		
		for(i=0;i<=20;i++) {
			System.out.print(i+"\t");
			
			try {
				Thread.sleep(50);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
/*
class MyThread extends Thread{
	
	public void run() {
		int i;
		
		for(i=0;i<=20;i++) {
			System.out.print(i+"\t");
			
			try {
				sleep(50);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
*/

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("start");
		
		MyThread runner1 = new MyThread();
		Thread th1 = new Thread(runner1);
		th1.start();
		Thread th2 = new Thread(new MyThread());
		th2.start();
		
		Thread t = Thread.currentThread();
		System.out.println(t.toString());
		/*
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		th1.start();
		th2.start();
		*/
		System.out.println("end");
	}

}
