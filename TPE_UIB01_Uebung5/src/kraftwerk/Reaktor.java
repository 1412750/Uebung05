/*
 * 
 */
package kraftwerk;

/**
 * Die Klasse Reaktor simuliert einen Reaktor in einem Kernkraftwerk mit den
 * nötigen Funktionen.
 * 
 * @author Sovann Som 1326670
 * @author Maximilian Czerwonka 1415407
 * @author Stephen Kessler 1412750
 * @version JDK8.0
 * 
 */
public class Reaktor implements Runnable {

	/** The thread. */
	private Thread thread;

	final int MAXIMALTEMPERATUR = 2878;
	private final static int KOEFFIZIENT = 1000/42;
	

	/** The tr. */
	private volatile int tr = 10;

	/**
	 * Hier wird der Reaktor gestartet. Die run-Methode wird aus dem Interface
	 * Runnable implementiert.
	 */
	public void run() {

		try {

			while (tr <= MAXIMALTEMPERATUR) {
				Thread.sleep(10);
				this.tr += 1;
				
				if(tr >= MAXIMALTEMPERATUR) {
			
					thread.interrupt();
					
				}

			}

		} catch (InterruptedException e) {
			System.out.println("Kernschmelze");
		}

		
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