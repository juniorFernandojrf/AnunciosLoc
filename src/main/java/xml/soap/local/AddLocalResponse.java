//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.23 às 05:08:02 AM WAT 
//


package xml.soap.local;

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
 *         &lt;element name="Header" type="{http://local.soap.xml}HeaderType"/&gt;
 *         &lt;element name="Body"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlRootElement(name = "AddLocalResponse")
public class AddLocalResponse {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Body", required = true)
    protected AddLocalResponse.Body body;

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
     *     {@link AddLocalResponse.Body }
     *     
     */
    public AddLocalResponse.Body getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link AddLocalResponse.Body }
     *     
     */
    public void setBody(AddLocalResponse.Body value) {
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
     *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "nome",
        "latitude",
        "longitude",
        "mensagem",
        "status"
    })
    public static class Body {

        @XmlElement(required = true)
        protected String nome;
        @XmlElement(required = true)
        protected String latitude;
        @XmlElement(required = true)
        protected String longitude;
        @XmlElement(required = true)
        protected String mensagem;
        protected boolean status;

        /**
         * Obtém o valor da propriedade nome.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNome() {
            return nome;
        }

        /**
         * Define o valor da propriedade nome.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNome(String value) {
            this.nome = value;
        }

        /**
         * Obtém o valor da propriedade latitude.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Define o valor da propriedade latitude.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Obtém o valor da propriedade longitude.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Define o valor da propriedade longitude.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * Obtém o valor da propriedade mensagem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMensagem() {
            return mensagem;
        }

        /**
         * Define o valor da propriedade mensagem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMensagem(String value) {
            this.mensagem = value;
        }

        /**
         * Obtém o valor da propriedade status.
         * 
         */
        public boolean isStatus() {
            return status;
        }

        /**
         * Define o valor da propriedade status.
         * 
         */
        public void setStatus(boolean value) {
            this.status = value;
        }

    }

}
