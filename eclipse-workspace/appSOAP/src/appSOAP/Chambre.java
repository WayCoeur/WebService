package appSOAP;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.lang.reflect.Field;

@WebService
public class Chambre {
	
	private float prix;
	private int number;
	private String type;
	private boolean occupe;
	public Chambre(){

	}
	public Chambre(float prix, int number, String type, boolean occupe) {
		this.prix = prix;
		this.number = number;
		this.type = type;
		this.occupe = occupe;
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

	public boolean isOccupe() {
		return occupe;
	}

	public void setOccupe(boolean occupe) {
		this.occupe = occupe;
	}

}

