package kraftwerk;

public class Waermetauscher {
	public int tausche(Wasserelement wasser1, Wasserelement wasser2) {
		return (int) ((wasser1.getTemperatur() + wasser2.getTemperatur()) /2); 
		
	}
}
