package Synchronisation;

public class ThreadLocalDemo {

	private ThreadLocal myThreadLocal = null;

	public void init() {
		myThreadLocal = new ThreadLocal<CustomTLSObject>();
	}

	Thread t1;
	Thread t2;

	private static int tlsCount1 = 0;
	private static int tlsCount2 = 0;

	public void createThreads() {

		t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					if (tlsCount1 == 0) {
						myThreadLocal.set(new CustomTLSObject("Gobi", 12345));
						tlsCount1++;
					} else {
						CustomTLSObject val = (CustomTLSObject) myThreadLocal.get();
						System.out
								.println("value from TLS" + val + " ThreadName => " + Thread.currentThread().getName());
					}

					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}, "Thread1");

		t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					if (tlsCount2 == 0) {
						myThreadLocal.set(new CustomTLSObject("Arun", 12));
						tlsCount2++;
					} else {
						CustomTLSObject val = (CustomTLSObject) myThreadLocal.get();
						System.out
								.println("value from TLS" + val + " ThreadName => " + Thread.currentThread().getName());
					}

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}, "Thread2");

		t1.start();
		t2.start();
	}

	public void getDataFromThread() {

	}

}
