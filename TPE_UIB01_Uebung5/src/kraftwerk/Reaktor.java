package kraftwerk;

// TODO: Auto-generated Javadoc
/**
 * The Class Reaktor.
 */
public class Reaktor implements Runnable {

	/** The thread. */
	private Thread thread;

	final static int MAXIMALTEMPERATUR = 2878;
	private boolean kernschmelze = false;
	private Wasserelement wasserelement;
	/** The tr. */
	private volatile int tr = 10;

	public Reaktor() {
		this.wasserelement = wasserelement;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public void run() {

		try {
			int zaehler = 0;
			

			while (true && tr < MAXIMALTEMPERATUR) {
				Thread.sleep(1000);
				this.tr += 100;
				zaehler++;

			}
			
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}

		System.out.println("Thread exiting.");
		thread.interrupt();

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
	 * Gets the tr.
	 *
	 * @return the tr
	 */
	public int getTr() {
		return this.tr;
	}

}