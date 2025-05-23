//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.23 às 05:08:02 AM WAT 
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
 *                   &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="dataexpiracao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="bloquear" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlRootElement(name = "AddAnuncioRequest")
public class AddAnuncioRequest {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Body", required = true)
    protected AddAnuncioRequest.Body body;

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
     *     {@link AddAnuncioRequest.Body }
     *     
     */
    public AddAnuncioRequest.Body getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link AddAnuncioRequest.Body }
     *     
     */
    public void setBody(AddAnuncioRequest.Body value) {
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
     *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="dataexpiracao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="bloquear" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
        "titulo",
        "local",
        "descricao",
        "dataexpiracao",
        "bloquear",
        "userId",
        "localId"
    })
    public static class Body {

        @XmlElement(required = true)
        protected String titulo;
        @XmlElement(required = true)
        protected String local;
        @XmlElement(required = true)
        protected String descricao;
        @XmlElement(required = true)
        protected String dataexpiracao;
        protected boolean bloquear;
        protected long userId;
        protected long localId;

        /**
         * Obtém o valor da propriedade titulo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitulo() {
            return titulo;
        }

        /**
         * Define o valor da propriedade titulo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitulo(String value) {
            this.titulo = value;
        }

        /**
         * Obtém o valor da propriedade local.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocal() {
            return local;
        }

        /**
         * Define o valor da propriedade local.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocal(String value) {
            this.local = value;
        }

        /**
         * Obtém o valor da propriedade descricao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescricao() {
            return descricao;
        }

        /**
         * Define o valor da propriedade descricao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescricao(String value) {
            this.descricao = value;
        }

        /**
         * Obtém o valor da propriedade dataexpiracao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataexpiracao() {
            return dataexpiracao;
        }

        /**
         * Define o valor da propriedade dataexpiracao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataexpiracao(String value) {
            this.dataexpiracao = value;
        }

        /**
         * Obtém o valor da propriedade bloquear.
         * 
         */
        public boolean isBloquear() {
            return bloquear;
        }

        /**
         * Define o valor da propriedade bloquear.
         * 
         */
        public void setBloquear(boolean value) {
            this.bloquear = value;
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

    }

}
