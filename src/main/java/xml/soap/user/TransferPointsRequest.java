//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.16 às 07:15:31 PM WAT 
//


package xml.soap.user;

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
 *         &lt;element name="Header" type="{http://user.soap.xml}HeaderType"/&gt;
 *         &lt;element name="Body"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="doadorId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="receptorId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlRootElement(name = "TransferPointsRequest")
public class TransferPointsRequest {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Body", required = true)
    protected TransferPointsRequest.Body body;

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
     *     {@link TransferPointsRequest.Body }
     *     
     */
    public TransferPointsRequest.Body getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferPointsRequest.Body }
     *     
     */
    public void setBody(TransferPointsRequest.Body value) {
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
     *         &lt;element name="doadorId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="receptorId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "doadorId",
        "receptorId",
        "points"
    })
    public static class Body {

        protected long doadorId;
        protected long receptorId;
        protected int points;

        /**
         * Obtém o valor da propriedade doadorId.
         * 
         */
        public long getDoadorId() {
            return doadorId;
        }

        /**
         * Define o valor da propriedade doadorId.
         * 
         */
        public void setDoadorId(long value) {
            this.doadorId = value;
        }

        /**
         * Obtém o valor da propriedade receptorId.
         * 
         */
        public long getReceptorId() {
            return receptorId;
        }

        /**
         * Define o valor da propriedade receptorId.
         * 
         */
        public void setReceptorId(long value) {
            this.receptorId = value;
        }

        /**
         * Obtém o valor da propriedade points.
         * 
         */
        public int getPoints() {
            return points;
        }

        /**
         * Define o valor da propriedade points.
         * 
         */
        public void setPoints(int value) {
            this.points = value;
        }

    }

}
