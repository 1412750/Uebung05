package kraftwerk;


/**
 * 
 * @author Sovann Som 1326670
 * @author Maximilian Czerwonka 1415407
 * @author Stephen Kessler 1412750
 * @version JDK8.0
 */

public class Waermetauscher {
	
	
	public int tausche(Wasserelement wasser1, Wasserelement wasser2) {
		return (int) ((wasser1.getTemperatur() + wasser2.getTemperatur()) /2); 
		
	}
}
