
public class Adapter_XML_to_JSON implements I_XML {
	private I_JSON json;
	public Adapter_XML_to_JSON() {
		// TODO Auto-generated constructor stub
		json = new JSON();
	}
	@Override
	public void data_XMLFormat(String data) {
		// TODO Auto-generated method stub
		System.out.println("Data in XML format => " + data);
		XML_to_JSON(data);
	}
	
	private void XML_to_JSON(String data) {
		System.out.println("Convert XML to JSON");
		json.data_JSONFormat(data);
	}
}
