package Thread;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Prod_Consume_Prob {

	Processor process;

	public Prod_Consume_Prob() {

		process = new Processor();

		// new thread to concurrently modify the list
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				process.Produce(20);
			}
		});
		t1.setName("Producer Thread");

		// new thread to concurrently modify the list
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				process.Consume(25);
				// process.testSleep();
			}
		});
		t2.setName("Consumer-1 Thread");

		// new thread to concurrently modify the list
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				process.Consume(5);
				throw new NullPointerException();
				// process.testSleep();
			}
		});
		t3.setName("Consumer-2 Thread");

		t3.start();

		t2.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t1.start();

		for (int i = 0; i < 4; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Current thread " + Thread.currentThread().getName() + " val " + i);
			// throw new NullPointerException();

		}

	}

	public static void main(String[] args) {

		Prod_Consume_Prob obj1 = new Prod_Consume_Prob();

	}

}
