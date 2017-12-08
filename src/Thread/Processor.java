package Thread;


public class Processor {

	
	public synchronized void Produce(int producedQty){
		
		System.out.println("Current thread "+Thread.currentThread().getName() + " Produced Qty");
		notifyAll();
		System.out.println("Current thread "+Thread.currentThread().getName() + " Notify called ");
		
	}
	
	public synchronized void Consume(int qty){
		
		System.out.println("Current thread "+Thread.currentThread().getName() + " Qty needed " + qty);
		
		try {
			wait();
//			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Current thread "+Thread.currentThread().getName() + " Lock released ");
		
	}
	
	
	
	public void testSleep(){
		
		System.out.println("Current thread "+Thread.currentThread().getName() + " Calling sleep ");
		
		try {
			wait();
//			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Current thread "+Thread.currentThread().getName() + " close sleep ");
	}
	
}
