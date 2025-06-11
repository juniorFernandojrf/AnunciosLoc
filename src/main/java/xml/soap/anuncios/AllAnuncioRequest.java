//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.11 às 01:13:46 PM WAT 
//


package xml.soap.anuncios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://anuncios.soap.xml}HeaderType"/&gt;
 *         &lt;element name="Body"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlRootElement(name = "AllAnuncioRequest")
public class AllAnuncioRequest {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Body", required = true)
    protected AllAnuncioRequest.Body body;

    /**
     * Obtém o valor da propriedade header.
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
     * Define o valor da propriedade header.
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
     * Obtém o valor da propriedade body.
     * 
     * @return
     *     possible object is
     *     {@link AllAnuncioRequest.Body }
     *     
     */
    public AllAnuncioRequest.Body getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link AllAnuncioRequest.Body }
     *     
     */
    public void setBody(AllAnuncioRequest.Body value) {
        this.body = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
        "userId",
        "localId",
        "latitude",
        "longitude"
    })
    public static class Body {

        protected long userId;
        protected long localId;
        protected double latitude;
        protected double longitude;

        /**
         * Obtém o valor da propriedade userId.
         * 
         */
        public long getUserId() {
            return userId;
        }

        /**
         * Define o valor da propriedade userId.
         * 
         */
        public void setUserId(long value) {
            this.userId = value;
        }

        /**
         * Obtém o valor da propriedade localId.
         * 
         */
        public long getLocalId() {
            return localId;
        }

        /**
         * Define o valor da propriedade localId.
         * 
         */
        public void setLocalId(long value) {
            this.localId = value;
        }

        /**
         * Obtém o valor da propriedade latitude.
         * 
         */
        public double getLatitude() {
            return latitude;
        }

        /**
         * Define o valor da propriedade latitude.
         * 
         */
        public void setLatitude(double value) {
            this.latitude = value;
        }

        /**
         * Obtém o valor da propriedade longitude.
         * 
         */
        public double getLongitude() {
            return longitude;
        }

        /**
         * Define o valor da propriedade longitude.
         * 
         */
        public void setLongitude(double value) {
            this.longitude = value;
        }

    }

}
