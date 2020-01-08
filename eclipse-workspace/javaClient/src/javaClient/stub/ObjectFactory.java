
package javaClient.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the javaClient.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetChambre_QNAME = new QName("http://appSOAP/", "getChambre");
    private final static QName _GetChambreResponse_QNAME = new QName("http://appSOAP/", "getChambreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: javaClient.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetChambre }
     * 
     */
    public GetChambre createGetChambre() {
        return new GetChambre();
    }

    /**
     * Create an instance of {@link GetChambreResponse }
     * 
     */
    public GetChambreResponse createGetChambreResponse() {
        return new GetChambreResponse();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChambre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "getChambre")
    public JAXBElement<GetChambre> createGetChambre(GetChambre value) {
        return new JAXBElement<GetChambre>(_GetChambre_QNAME, GetChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChambreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "getChambreResponse")
    public JAXBElement<GetChambreResponse> createGetChambreResponse(GetChambreResponse value) {
        return new JAXBElement<GetChambreResponse>(_GetChambreResponse_QNAME, GetChambreResponse.class, null, value);
    }

}
