package appSOAP;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:2000/Chambre", new Chambre());
		Endpoint.publish("http://localhost:2000/Hotel", new Hotel());
	}
}