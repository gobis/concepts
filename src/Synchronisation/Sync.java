package Synchronisation;

public class Sync {

	
	public static void main(String[] args) {

		final Sync sync = new Sync();
		final Sync sync2 = new Sync();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				sync.fn1();
				
				// pair with fn4
				//sync.fn3();
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				sync2.fn2();
				//sync.fn2();
				
//				pair with fn4 
				// sync2.fn4();
			
				
			}
		});
		t2.start();

	}
	
	/*class data{*/
		
		public synchronized void fn1(){
			System.out.println("Thread name"+Thread.currentThread().getName() + "  in ");
			try {
				Thread.sleep(2*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread name"+Thread.currentThread().getName() + "  out ");
			
			
		}
		
		public synchronized void fn2(){
		

			System.out.println("Thread name"+Thread.currentThread().getName() + "  in ");
			try {
				Thread.sleep(2*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread name"+Thread.currentThread().getName() + "  out ");
		
			
		}
		
		
		public static synchronized void fn3(){
			System.out.println("Thread name"+Thread.currentThread().getName() + "  in ");
			try {
				Thread.sleep(2*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread name"+Thread.currentThread().getName() + "  out ");
		}

		
		public static synchronized void fn4(){

			System.out.println("Thread name"+Thread.currentThread().getName() + "  in ");
			try {
				Thread.sleep(2*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread name"+Thread.currentThread().getName() + "  out ");
		
			
		}
		
		
		
//	}
    
    
    
	
	
}


