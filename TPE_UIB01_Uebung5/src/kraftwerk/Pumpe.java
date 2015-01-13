package kraftwerk;

import java.util.Collections;

/**
 * In der Klasse Pumpe umfasst die Funktionene einer Pumpe, z.B. die
 * Pumpleistung, die für die Kühlung benötigt wird.
 * 
 * @author tomi
 *
 */
public class Pumpe implements Runnable {

	/** The thread. */
	private Thread thread;

	/** The leistung. */
	private int leistung;

	/**
	 * Hier ist der Konstruktor, welcher die Leistung beinhaltet.
	 *
	 * @param leistung
	 *            the leistung
	 */
	public Pumpe(int leistung) {
		this.leistung = leistung;
	}

	/**
	 * Instantiates a new pumpe.
	 */
	public Pumpe() {
		this.leistung = 1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		try {
			Wasserelement wasser = null;
			while (true) {
				wasser = Kernkraftwerk.wasserkreislauf.get(0);
				wasser.setTemperatur(Kernkraftwerk.reaktor.getTr());
				Kernkraftwerk.wasserkreislauf.set(0, wasser);
				int temperatur = Kernkraftwerk.tauscher1.tausche(
						Kernkraftwerk.wasserkreislauf.get(1),
						Kernkraftwerk.wasserkreislauf.get(10));
				Kernkraftwerk.wasserkreislauf.get(11).setTemperatur(temperatur);
				Thread.sleep(1000 / this.leistung);
				Collections.rotate(Kernkraftwerk.wasserkreislauf, 1);

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
	 * Sets the leistung.
	 *
	 * @param leistung
	 *            the new leistung
	 */
	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}
}