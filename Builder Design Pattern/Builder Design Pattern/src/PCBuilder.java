
public class PCBuilder implements Builder {
	private String RAMcapacity;
	private String processor_CPU;
	private String HDcapacity;
	private boolean SSD_support;
	private String display_monitor;
	
	@Override
	public PCBuilder RAM(String RAMcapacity) {
		// TODO Auto-generated method stub
		this.RAMcapacity = RAMcapacity;
		return this;
	}
	
	@Override
	public Builder Processor(String processor_CPU) {
		// TODO Auto-generated method stub
		this.processor_CPU = processor_CPU;
		return this;
	}
	
	@Override
	public PCBuilder HardDisk(String HDcapacity) {
		// TODO Auto-generated method stub
		this.HDcapacity = HDcapacity;
		return this;
	}
	
	@Override
	public PCBuilder SSD(boolean SSD_support) {
		// TODO Auto-generated method stub
		this.SSD_support = SSD_support;
		return this;
	}

	@Override
	public PCBuilder Display(String display_monitor) {
		// TODO Auto-generated method stub
		this.display_monitor = display_monitor;
		return this;
	}
	
	public PC build() {
		return new PC(RAMcapacity, processor_CPU, HDcapacity, SSD_support, display_monitor);
	}
}
