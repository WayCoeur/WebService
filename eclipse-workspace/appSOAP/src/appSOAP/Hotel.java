package appSOAP;

import javax.jws.WebMethod;
import javax.jws.WebService;


	@WebService	

	public class Hotel {
		
		 Chambre room;
		String name;
		
		
		
	@WebMethod

		
		public Chambre SendFreeRoom() {
			return room;
		}

	}
