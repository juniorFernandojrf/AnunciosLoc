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
 *                   &lt;element name="chave" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlRootElement(name = "UserProfileRequest")
public class UserProfileRequest {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Body", required = true)
    protected UserProfileRequest.Body body;

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
     *     {@link UserProfileRequest.Body }
     *     
     */
    public UserProfileRequest.Body getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfileRequest.Body }
     *     
     */
    public void setBody(UserProfileRequest.Body value) {
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
     *         &lt;element name="chave" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
        "chave",
        "valor",
        "userId"
    })
    public static class Body {

        @XmlElement(required = true)
        protected String chave;
        @XmlElement(required = true)
        protected String valor;
        protected long userId;

        /**
         * Obtém o valor da propriedade chave.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChave() {
            return chave;
        }

        /**
         * Define o valor da propriedade chave.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChave(String value) {
            this.chave = value;
        }

        /**
         * Obtém o valor da propriedade valor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValor() {
            return valor;
        }

        /**
         * Define o valor da propriedade valor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValor(String value) {
            this.valor = value;
        }

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

    }

}
