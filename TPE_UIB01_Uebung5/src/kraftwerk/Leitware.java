package kraftwerk;


/**
 * In dieser Klasse wird die Temperatur gesteuert.
 * 
 * @author Sovann Som 1326670
 * @author Maximilian Czerwonka 1415407
 * @author Stephen Kessler 1412750
 * @version JDK8.0
 */

public class Leitware implements Runnable {
	
	
	private Thread thread;
	
	
	public void run() {
		try {
			while (Kernkraftwerk.reaktor.getTr() < Kernkraftwerk.reaktor.MAXIMALTEMPERATUR) {
				Thread.sleep(10);
				System.out.println("Temperatur Reaktor: " + Kernkraftwerk.reaktor.getTr() + " C"+
						", Temperatur Rückfluss in Rhein " + Kernkraftwerk.wasserkreislauf.get(5).getTemperatur());
			}
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}
		
	}

	/**
	 * Der Thread wird mit der Methode start() gestartet.
	 */
	
	public void start() {
		if (this.thread == null) {
			this.thread = new Thread(this);
			this.thread.start();
		}
	}
	

}