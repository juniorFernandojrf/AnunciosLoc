//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.23 às 05:08:02 AM WAT 
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
 *                   &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="chaveAntiga" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="novaChaver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="novoValor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlRootElement(name = "EditUserProfileRequest")
public class EditUserProfileRequest {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Body", required = true)
    protected EditUserProfileRequest.Body body;

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
     *     {@link EditUserProfileRequest.Body }
     *     
     */
    public EditUserProfileRequest.Body getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link EditUserProfileRequest.Body }
     *     
     */
    public void setBody(EditUserProfileRequest.Body value) {
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
     *         &lt;element name="chaveAntiga" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="novaChaver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="novoValor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "chaveAntiga",
        "novaChaver",
        "novoValor"
    })
    public static class Body {

        protected long userId;
        @XmlElement(required = true)
        protected String chaveAntiga;
        @XmlElement(required = true)
        protected String novaChaver;
        @XmlElement(required = true)
        protected String novoValor;

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
         * Obtém o valor da propriedade chaveAntiga.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChaveAntiga() {
            return chaveAntiga;
        }

        /**
         * Define o valor da propriedade chaveAntiga.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChaveAntiga(String value) {
            this.chaveAntiga = value;
        }

        /**
         * Obtém o valor da propriedade novaChaver.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNovaChaver() {
            return novaChaver;
        }

        /**
         * Define o valor da propriedade novaChaver.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNovaChaver(String value) {
            this.novaChaver = value;
        }

        /**
         * Obtém o valor da propriedade novoValor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNovoValor() {
            return novoValor;
        }

        /**
         * Define o valor da propriedade novoValor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNovoValor(String value) {
            this.novoValor = value;
        }

    }

}
