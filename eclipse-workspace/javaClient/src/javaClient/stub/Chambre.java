
package javaClient.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour chambre complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="chambre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="occupe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambre", propOrder = {
    "occupe",
    "prix",
    "type"
})
public class Chambre {

    protected boolean occupe;
    protected float prix;
    protected String type;

    /**
     * Obtient la valeur de la propri�t� occupe.
     * 
     */
    public boolean isOccupe() {
        return occupe;
    }

    /**
     * D�finit la valeur de la propri�t� occupe.
     * 
     */
    public void setOccupe(boolean value) {
        this.occupe = value;
    }

    /**
     * Obtient la valeur de la propri�t� prix.
     * 
     */
    public float getPrix() {
        return prix;
    }

    /**
     * D�finit la valeur de la propri�t� prix.
     * 
     */
    public void setPrix(float value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propri�t� type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
