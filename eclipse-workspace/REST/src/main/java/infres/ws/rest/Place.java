package infres.ws.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Place")
public class Place {

    private String place;

    public Place(String place) {
        this.place=place;
    }

    @XmlElement(name = "Place")
    public String getPlace() {
        return place;
    }
}