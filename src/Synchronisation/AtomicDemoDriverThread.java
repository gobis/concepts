package Synchronisation;

import java.util.concurrent.atomic.AtomicInteger;

class IncVar {
	public static AtomicInteger atomVar = new AtomicInteger(); 
	public static int testVar = 0 ; 
	
}

public class AtomicDemoDriverThread extends Thread {
	
	public static void main(String[] args) {
		for(int i =0 ; i<25 ; i++){
			AtomicDemoDriverThread thread = new AtomicDemoDriverThread();
			thread.start();
		}
	}

	@Override
	public void run() {
		IncVar.atomVar.incrementAndGet();
		System.out.println(IncVar.atomVar);
		
		
		
	}
	
	

}
