package appSOAP;

import javax.jws.WebMethod;
import javax.jws.WebService;


	@WebService	

	public class Hotel {
		String name;

		@WebMethod

		public Chambre getRoom() {
				return new Chambre();
		}

	}
