package Synchronisation;


public class ThreadLocalDriver {
	
	public static void main(String[] args) {
		ThreadLocalDemo demo = new ThreadLocalDemo();
		demo.init();
		demo.createThreads();
		demo.getDataFromThread();
	}

}
