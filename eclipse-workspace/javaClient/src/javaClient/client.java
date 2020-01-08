package javaClient;
import javaClient.stub.Chambre;
import javaClient.stub.ChambreService;
import javaClient.stub.Hotel;
import javaClient.stub.HotelService;


public class client {
	
	
	public static void main(String[] args) {

	Chambre chambreService = new ChambreService().getChambrePort();

	Hotel hotel = new HotelService().getHotelPort();
	System.out.println("Retour service = "+ chambreService.getType());
	System.out.println("Prix = " + chambreService.getPrix());

	}
}
