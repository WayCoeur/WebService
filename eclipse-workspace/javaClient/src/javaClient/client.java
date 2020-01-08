package javaClient;
import javaClient.stub.Chambre;
import javaClient.stub.ChambreService;


public class client {
	
	
	public static void main(String[] args) {

	Chambre chambreService = (new ChambreService()).getChambrePort();

	System.out.println("Retour service = "+ chambreService.sendType());

	}
}
