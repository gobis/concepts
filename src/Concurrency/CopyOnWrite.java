package Concurrency;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {

	
	// #LEARN , uncomment the iterator and the next line .. & check with the current output  
	
	public static void main(String[] args) {
		final CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5));
 
		// new thread to concurrently modify the list
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					// sleep a little so that for loop below can print part of
					// the list
					Thread.sleep(250);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
				numbers.add(10);
				System.out.println("new item added");
			}
		}).start();
 
		// #LEARN , uncomment the iterator and the next line .. & check with the current output  
		
		for (/*int i : numbers*/int i =0 ;i<numbers.size();i++) {
//			System.out.println(i);
			System.out.println(numbers.get(i));
			
			// sleep a little to let other thread finish adding an element
			// before iteration is complete
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	
	
	}
	

}
