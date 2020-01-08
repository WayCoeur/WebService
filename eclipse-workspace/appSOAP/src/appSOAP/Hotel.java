package appSOAP;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;


@WebService
public class Hotel {
	private ArrayList<Chambre> chambres = new ArrayList<>();

	public Hotel() {
		chambres.add(new Chambre(50,1,"Simple",false));
		chambres.add(new Chambre(60,2,"Double",false));
		chambres.add(new Chambre(70,3,"Triple",false));
		chambres.add(new Chambre(200,4,"Suite",false));
	}

	@WebMethod
	public Chambre getChambre(int number){
		return chambres.get(number);
	}

	}
