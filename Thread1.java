

public class Thread1 extends Thread{
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Value of i it is running as shutdown Hook:"  +i);
			try{
				Thread.sleep(1000);
			}catch (Exception e) {
			
			}
		}
	}

}
