package kraftwerk;

// TODO: Auto-generated Javadoc
/**
 * The Class Wasserelement.
 */
public class Wasserelement {
	
	/** The temperatur. */
	private volatile int temperatur;
	
	/**
	 * Instantiates a new wasserelement.
	 *
	 * @param temperatur the temperatur
	 */
	public Wasserelement(int temperatur) {
		this.temperatur = temperatur;
	}
	
	/**
	 * Instantiates a new wasserelement.
	 */
	public Wasserelement() {
		this.temperatur = 10;
	}
	
	/**
	 * Gets the temperatur.
	 *
	 * @return the temperatur
	 */
	public int getTemperatur() {
		return temperatur;
	}

	/**
	 * Sets the temperatur.
	 *
	 * @param temperatur the new temperatur
	 */
	public void setTemperatur(int temperatur) {
		this.temperatur = temperatur;
	}
	
}
