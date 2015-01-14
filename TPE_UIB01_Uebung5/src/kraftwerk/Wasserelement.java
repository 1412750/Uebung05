package kraftwerk;

/**
 * The Class Wasserelement.
 * 
 * @author Sovann Som 1326670
 * @author Maximilian Czerwonka 1415407
 * @author Stephen Kessler 1412750
 * @version JDK8.0
 */

public class Wasserelement {
	
	/** The temperatur. */
	private volatile int temperatur;
	
	/**
	 * Die neue Temperatur wird initialisiert.
	 */
	
	public Wasserelement(int temperatur) {
		this.temperatur = temperatur;
	}
	
	/**
	 * Das Wasserelement wird initialisiert.
	 */
	
	public Wasserelement() {
		this.temperatur = 10;
	}
	
	/**
	 * Hier bekommen wird die aktuelle Temperatur geliefert.
	 */
	
	public int getTemperatur() {
		return temperatur;
	}

	/**
	 * Hier wird die Temperatur gesetzt.
	 */
	
	public void setTemperatur(int temperatur) {
		this.temperatur = temperatur;
	}
	
}
