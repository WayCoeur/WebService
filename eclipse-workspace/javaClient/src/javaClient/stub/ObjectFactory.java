
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

    private final static QName _SendType_QNAME = new QName("http://appSOAP/", "SendType");
    private final static QName _SendTypeResponse_QNAME = new QName("http://appSOAP/", "SendTypeResponse");
    private final static QName _GetPrix_QNAME = new QName("http://appSOAP/", "getPrix");
    private final static QName _GetPrixResponse_QNAME = new QName("http://appSOAP/", "getPrixResponse");
    private final static QName _GetType_QNAME = new QName("http://appSOAP/", "getType");
    private final static QName _GetTypeResponse_QNAME = new QName("http://appSOAP/", "getTypeResponse");
    private final static QName _SetPrix_QNAME = new QName("http://appSOAP/", "setPrix");
    private final static QName _SetPrixResponse_QNAME = new QName("http://appSOAP/", "setPrixResponse");
    private final static QName _SetType_QNAME = new QName("http://appSOAP/", "setType");
    private final static QName _SetTypeResponse_QNAME = new QName("http://appSOAP/", "setTypeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: javaClient.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendType }
     * 
     */
    public SendType createSendType() {
        return new SendType();
    }

    /**
     * Create an instance of {@link SendTypeResponse }
     * 
     */
    public SendTypeResponse createSendTypeResponse() {
        return new SendTypeResponse();
    }

    /**
     * Create an instance of {@link GetPrix }
     * 
     */
    public GetPrix createGetPrix() {
        return new GetPrix();
    }

    /**
     * Create an instance of {@link GetPrixResponse }
     * 
     */
    public GetPrixResponse createGetPrixResponse() {
        return new GetPrixResponse();
    }

    /**
     * Create an instance of {@link GetType }
     * 
     */
    public GetType createGetType() {
        return new GetType();
    }

    /**
     * Create an instance of {@link GetTypeResponse }
     * 
     */
    public GetTypeResponse createGetTypeResponse() {
        return new GetTypeResponse();
    }

    /**
     * Create an instance of {@link SetPrix }
     * 
     */
    public SetPrix createSetPrix() {
        return new SetPrix();
    }

    /**
     * Create an instance of {@link SetPrixResponse }
     * 
     */
    public SetPrixResponse createSetPrixResponse() {
        return new SetPrixResponse();
    }

    /**
     * Create an instance of {@link SetType }
     * 
     */
    public SetType createSetType() {
        return new SetType();
    }

    /**
     * Create an instance of {@link SetTypeResponse }
     * 
     */
    public SetTypeResponse createSetTypeResponse() {
        return new SetTypeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendType }{@code >}
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "SendType")
    public JAXBElement<SendType> createSendType(SendType value) {
        return new JAXBElement<SendType>(_SendType_QNAME, SendType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "SendTypeResponse")
    public JAXBElement<SendTypeResponse> createSendTypeResponse(SendTypeResponse value) {
        return new JAXBElement<SendTypeResponse>(_SendTypeResponse_QNAME, SendTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrix }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPrix }{@code >}
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "getPrix")
    public JAXBElement<GetPrix> createGetPrix(GetPrix value) {
        return new JAXBElement<GetPrix>(_GetPrix_QNAME, GetPrix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrixResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPrixResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "getPrixResponse")
    public JAXBElement<GetPrixResponse> createGetPrixResponse(GetPrixResponse value) {
        return new JAXBElement<GetPrixResponse>(_GetPrixResponse_QNAME, GetPrixResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "getType")
    public JAXBElement<GetType> createGetType(GetType value) {
        return new JAXBElement<GetType>(_GetType_QNAME, GetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "getTypeResponse")
    public JAXBElement<GetTypeResponse> createGetTypeResponse(GetTypeResponse value) {
        return new JAXBElement<GetTypeResponse>(_GetTypeResponse_QNAME, GetTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPrix }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetPrix }{@code >}
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "setPrix")
    public JAXBElement<SetPrix> createSetPrix(SetPrix value) {
        return new JAXBElement<SetPrix>(_SetPrix_QNAME, SetPrix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPrixResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetPrixResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "setPrixResponse")
    public JAXBElement<SetPrixResponse> createSetPrixResponse(SetPrixResponse value) {
        return new JAXBElement<SetPrixResponse>(_SetPrixResponse_QNAME, SetPrixResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "setType")
    public JAXBElement<SetType> createSetType(SetType value) {
        return new JAXBElement<SetType>(_SetType_QNAME, SetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://appSOAP/", name = "setTypeResponse")
    public JAXBElement<SetTypeResponse> createSetTypeResponse(SetTypeResponse value) {
        return new JAXBElement<SetTypeResponse>(_SetTypeResponse_QNAME, SetTypeResponse.class, null, value);
    }

}
