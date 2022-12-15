
public class JSON implements I_JSON {
	@Override
	public void data_JSONFormat(String data) {
		// TODO Auto-generated method stub
		data = data.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Data in JSON format => " + data);
	}
}
