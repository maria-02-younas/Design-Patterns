
public class PC {
	private final String RAMcapacity;
	private final String HDcapacity;
	private final String processor_CPU;
	private final boolean SSD_support;
	private final String display_monitor;
	
	public PC(String RAMcapacity, String processor_CPU, String HDcapacity, boolean SSD_support, String display_monitor) {
		// TODO Auto-generated constructor stub
		this.RAMcapacity = RAMcapacity;
		this.processor_CPU = processor_CPU;
		this.HDcapacity = HDcapacity;
		this.SSD_support = SSD_support;
		this.display_monitor = display_monitor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "RAM: " + RAMcapacity + "\nHard Disk: " + HDcapacity 
				+ "\nProcessor: " + processor_CPU + "\nSSD support: " + SSD_support
				+ "\nDisplay: " + display_monitor + "\n\n\n";
	}
}
