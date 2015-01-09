package kraftwerk;

public class Wasserelement {
	private volatile int temperatur;
	
	public Wasserelement(int temperatur) {
		this.temperatur = temperatur;
	}
	
	public Wasserelement() {
		this.temperatur = 10;
	}
	
	public int getTemperatur() {
		return temperatur;
	}

	public void setTemperatur(int temperatur) {
		this.temperatur = temperatur;
	}
	
}
