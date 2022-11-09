
public class MsiManufacturer extends Company {

	@Override
	public GPU createGPU() {
		// TODO Auto-generated method stub
		return new MsiGPU();
	}

	@Override
	public Monitor createMonitor() {
		// TODO Auto-generated method stub
		return new MsiMonitor();
	}
	
}
