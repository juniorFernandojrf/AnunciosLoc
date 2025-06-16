//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.13 às 05:33:49 PM WAT 
//


package xml.soap.anuncios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *                   &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="datainicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="dataExpiracao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="politicaEntrega" type="{http://anuncios.soap.xml}PoliticaEntregaType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
     *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="datainicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="dataExpiracao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="politicaEntrega" type="{http://anuncios.soap.xml}PoliticaEntregaType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "descricao",
        "datainicio",
        "dataExpiracao",
        "userId",
        "localId",
        "politicaEntrega"
    })
    public static class Body {

        @XmlElement(required = true)
        protected String titulo;
        @XmlElement(required = true)
        protected String descricao;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar datainicio;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dataExpiracao;
        protected long userId;
        protected long localId;
        protected List<PoliticaEntregaType> politicaEntrega;

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
         * Obtém o valor da propriedade datainicio.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatainicio() {
            return datainicio;
        }

        /**
         * Define o valor da propriedade datainicio.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatainicio(XMLGregorianCalendar value) {
            this.datainicio = value;
        }

        /**
         * Obtém o valor da propriedade dataExpiracao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataExpiracao() {
            return dataExpiracao;
        }

        /**
         * Define o valor da propriedade dataExpiracao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataExpiracao(XMLGregorianCalendar value) {
            this.dataExpiracao = value;
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

        /**
         * Gets the value of the politicaEntrega property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the politicaEntrega property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPoliticaEntrega().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PoliticaEntregaType }
         * 
         * 
         */
        public List<PoliticaEntregaType> getPoliticaEntrega() {
            if (politicaEntrega == null) {
                politicaEntrega = new ArrayList<PoliticaEntregaType>();
            }
            return this.politicaEntrega;
        }

    }

}
