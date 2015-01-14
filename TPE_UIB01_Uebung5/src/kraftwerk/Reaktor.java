/*
 * 
 */
package kraftwerk;

/**
 * Die Klasse Reaktor simuliert einen Reaktor in einem Kernkraftwerk mit den
 * nötigen Funktionen.
 * 
 */
public class Reaktor implements Runnable {

	/** The thread. */
	private Thread thread;

	final static int MAXIMALTEMPERATUR = 2878;
	private boolean kernschmelze = false;
	private Wasserelement wasserelement;
	/** The tr. */
	private volatile int tr = 10;

	/**
	 * Hier wird der Reaktor gestartet. Die run-Methode wird aus dem Interface
	 * Runnable implementiert.
	 */
	public void run() {

		try {
			int zaehler = 0;

			while (Thread.currentThread().isInterrupted() && true
					&& tr < MAXIMALTEMPERATUR) {
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
	 * Hier wird der Thread gestartet, die für die Ausgabe benötigt wird.
	 */
	public void start() {
		if (this.thread == null) {
			this.thread = new Thread(this);
			this.thread.start();
		}
	}

	/**
	 * Gibt die Temperatur des Reaktors aus.
	 *
	 * @return the tr
	 */
	public int getTr() {
		return this.tr;
	}

}