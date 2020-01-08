package appSOAP;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService	

public class Chambre {
	
	float prix =35;
	int number = 12;
	String type="basique";
	boolean occupe= true;
	
	
	
@WebMethod

	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String SendType() {
		return type;
	}

}

