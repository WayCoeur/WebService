
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

    private final static QName _GetRoomResponse_QNAME = new QName("http://appSOAP/", "getRoomResponse");
    private final static QName _GetRoom_QNAME = new QName("http://appSOAP/", "getRoom");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: javaClient.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRoom }
     * 
     */
    public GetRoom createGetRoom() {
        return new GetRoom();
    }

    /**
     * Create an instance of {@link GetRoomResponse }
     * 
     */
    public GetRoomResponse createGetRoomResponse() {
        return new GetRoomResponse();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "getRoomResponse")
    public JAXBElement<GetRoomResponse> createGetRoomResponse(GetRoomResponse value) {
        return new JAXBElement<GetRoomResponse>(_GetRoomResponse_QNAME, GetRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "getRoom")
    public JAXBElement<GetRoom> createGetRoom(GetRoom value) {
        return new JAXBElement<GetRoom>(_GetRoom_QNAME, GetRoom.class, null, value);
    }

}
