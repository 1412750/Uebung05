/*
 * 
 */
package kraftwerk;

// TODO: Auto-generated Javadoc
/**
 * The Class Waermetauscher.
 */
public class Waermetauscher {
	
	/**
	 * Tausche.
	 *
	 * @param wasser1 the wasser1
	 * @param wasser2 the wasser2
	 * @return the int
	 */
	public int tausche(Wasserelement wasser1, Wasserelement wasser2) {
		return (int) ((wasser1.getTemperatur() + wasser2.getTemperatur()) /2); 
		
	}
}
