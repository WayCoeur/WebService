package infres.ws.rest;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Date;

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

    @XmlAttribute
    public Company getCompany() {
        return company;
    }

    @XmlAttribute
    public Place getPlace() {
        return place;
    }

    @XmlAttribute
    public Integer getPrix() {
        return prix;
    }

    @XmlAttribute
    public Date getDate() {
        return date;
    }
}