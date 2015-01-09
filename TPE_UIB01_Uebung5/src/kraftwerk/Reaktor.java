package kraftwerk;

public class Reaktor implements Runnable {
	private Thread thread;
	private volatile int tr = 10;
	
	public void run() {
		try {
			while (true) {
				Thread.sleep(100);
				this.tr += 1;
			}
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("Thread exiting.");
	}

	public void start() {
		if (this.thread == null) {
			this.thread = new Thread(this);
			this.thread.start();
		}
	}
	
	public int getTr() {
		return this.tr;
	}
	
}