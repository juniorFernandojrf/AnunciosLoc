//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.11 às 01:13:46 PM WAT 
//


package xml.soap.station;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
<<<<<<< HEAD
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
=======
 * <p>Java class for anonymous complex type.
 * 
 * 
 * <pre>
 *         &lt;element name="Body"&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "body"
})
@XmlRootElement(name = "AddDockReq")
public class AddDockReq {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Body", required = true)
    protected AddDockReq.Body body;

    /**
<<<<<<< HEAD
     * Obtém o valor da propriedade header.
=======
     * Gets the value of the header property.
>>>>>>> olivio
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
<<<<<<< HEAD
     * Define o valor da propriedade header.
=======
     * Sets the value of the header property.
>>>>>>> olivio
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
<<<<<<< HEAD
     * Obtém o valor da propriedade body.
=======
     * Gets the value of the body property.
>>>>>>> olivio
     * 
     * @return
     *     possible object is
     *     {@link AddDockReq.Body }
     *     
     */
    public AddDockReq.Body getBody() {
        return body;
    }

    /**
<<<<<<< HEAD
     * Define o valor da propriedade body.
=======
     * Sets the value of the body property.
>>>>>>> olivio
     * 
     * @param value
     *     allowed object is
     *     {@link AddDockReq.Body }
     *     
     */
    public void setBody(AddDockReq.Body value) {
        this.body = value;
    }


    /**
<<<<<<< HEAD
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
=======
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
>>>>>>> olivio
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="station" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "station"
    })
    public static class Body {

        @XmlElement(required = true)
        protected String station;

        /**
<<<<<<< HEAD
         * Obtém o valor da propriedade station.
=======
         * Gets the value of the station property.
>>>>>>> olivio
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStation() {
            return station;
        }

        /**
<<<<<<< HEAD
         * Define o valor da propriedade station.
=======
         * Sets the value of the station property.
>>>>>>> olivio
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStation(String value) {
            this.station = value;
        }

    }

}
