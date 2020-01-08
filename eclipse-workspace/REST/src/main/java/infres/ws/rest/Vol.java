package infres.ws.rest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@XmlRootElement(name = "Vol")
public class Vol {

    private long id;

    private Company company;

    private Place place;

    private Integer prix;

    private Date date;

    public Vol() {
        this.id = 1;
        this.company = new Company("Japan Airline");
        this.place = new Place("J45");
        this.prix = 50;
        this.date = new Date();
    }

    @XmlElement(name="Company")
    public Company getCompany() {
        return company;
    }

    @XmlElement(name = "Place")
    public Place getPlace() {
        return place;
    }

    @XmlElement(name = "Prix")
    public Integer getPrix() {
        return prix;
    }

    @XmlElement(name = "Date")
    public Date getDate() {
        return date;
    }
}