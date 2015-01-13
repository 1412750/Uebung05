package kraftwerk;

// TODO: Auto-generated Javadoc
/**
 * The Class Leitware.
 */
public class Leitware implements Runnable {
	
	/** The thread. */
	private Thread thread;
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		try {
			while (true) {
				Thread.sleep(100);
				System.out.println("Temperatur Reaktor: " + Kernkraftwerk.reaktor.getTr() + " C"+
						", Temperatur Rückfluss in Rhein " + Kernkraftwerk.wasserkreislauf.get(5).getTemperatur());
			}
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("Thread exiting.");
	}

	/**
	 * Start.
	 */
	public void start() {
		if (this.thread == null) {
			this.thread = new Thread(this);
			this.thread.start();
		}
	}
	
	/**
	 * Destroy.
	 */
	public void destroy() {
		try {
			this.thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}