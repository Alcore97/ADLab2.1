
package org.me.image;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchbyId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchbyId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_imatge" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchbyId", propOrder = {
    "idImatge"
})
public class SearchbyId {

    @XmlElement(name = "id_imatge")
    protected int idImatge;

    /**
     * Obtiene el valor de la propiedad idImatge.
     * 
     */
    public int getIdImatge() {
        return idImatge;
    }

    /**
     * Define el valor de la propiedad idImatge.
     * 
     */
    public void setIdImatge(int value) {
        this.idImatge = value;
    }

}
