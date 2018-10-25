
package org.me.image;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchbyKeywords complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchbyKeywords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paraulaclau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchbyKeywords", propOrder = {
    "paraulaclau"
})
public class SearchbyKeywords {

    protected String paraulaclau;

    /**
     * Obtiene el valor de la propiedad paraulaclau.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaulaclau() {
        return paraulaclau;
    }

    /**
     * Define el valor de la propiedad paraulaclau.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaulaclau(String value) {
        this.paraulaclau = value;
    }

}
