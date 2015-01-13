package kraftwerk;

import java.util.Collections;

public class Pumpe implements Runnable {
	private Thread thread;
	private int leistung;
	
	public Pumpe(int leistung) {
		this.leistung = leistung;
	}
	
	public Pumpe() {
		this.leistung = 1;
	}
	
	public void run() {
		try {
			Wasserelement wasser = null;
			while (true) {
				wasser = Kernkraftwerk.wasserkreislauf.get(0);
				wasser.setTemperatur(Kernkraftwerk.reaktor.getTr());
				Kernkraftwerk.wasserkreislauf.set(0, wasser);
				int temperatur = Kernkraftwerk.tauscher1.tausche(Kernkraftwerk.wasserkreislauf.get(1), Kernkraftwerk.wasserkreislauf.get(10));
				Kernkraftwerk.wasserkreislauf.get(11).setTemperatur(temperatur);
				Thread.sleep(1000 / this.leistung);
				Collections.rotate(Kernkraftwerk.wasserkreislauf, 1);
				
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
	
	
	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}
}