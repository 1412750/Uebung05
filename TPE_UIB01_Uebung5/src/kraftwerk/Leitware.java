package kraftwerk;

public class Leitware implements Runnable {
	private Thread thread;
	
	public void run() {
		try {
			while (true) {
				Thread.sleep(300);
				System.out.println("Temperatur Reaktor: " + Kernkraftwerk.reaktor.getTr() + 
						", Temperatur R�ckfluss in Rhein " + Kernkraftwerk.wasserkreislauf.get(5).getTemperatur());
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
	
	public void destroy() {
		try {
			this.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}