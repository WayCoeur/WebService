package infres.ws.rest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Company")
public class Company {

    private String company;

    public Company(String company) {
        this.company=company;
    }

    @XmlElement(name = "Company")
    public String getCompany() {
        return company;
    }
}