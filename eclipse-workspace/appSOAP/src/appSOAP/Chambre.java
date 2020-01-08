package appSOAP;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService	

public class Chambre {
	
	private float prix;
	private int number;
	private String type;
	private boolean occupe;

	public Chambre() {
		this.prix = 35;
		this.number = 12;
		this.type = "basique";
		this.occupe = true;
	}

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
}

