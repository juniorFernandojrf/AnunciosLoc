//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.19 às 01:36:48 PM WAT 
//


package xml.soap.anuncios;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataExpiracao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bloquear" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="politiEntrega" type="{http://anuncios.soap.xml}PoliticaEntregaType" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://anuncios.soap.xml}UserType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LocalType" type="{http://anuncios.soap.xml}LocalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="anuncioId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "dataInicio",
    "dataExpiracao",
    "bloquear",
    "id",
    "mensagem",
    "status",
    "politiEntrega",
    "usuario",
    "localType",
    "anuncioId",
    "userId",
    "localId"
})
@XmlRootElement(name = "AddAnuncioResponse")
public class AddAnuncioResponse {

    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected String local;
    @XmlElement(required = true)
    protected String dataInicio;
    @XmlElement(required = true)
    protected String dataExpiracao;
    @XmlElement(required = true)
    protected String bloquear;
    protected int id;
    @XmlElement(required = true)
    protected String mensagem;
    protected boolean status;
    protected PoliticaEntregaType politiEntrega;
    protected List<UserType> usuario;
    @XmlElement(name = "LocalType")
    protected List<LocalType> localType;
    protected Long anuncioId;
    protected Long userId;
    protected Long localId;

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
     * Obtém o valor da propriedade dataInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Define o valor da propriedade dataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicio(String value) {
        this.dataInicio = value;
    }

    /**
     * Obtém o valor da propriedade dataExpiracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExpiracao() {
        return dataExpiracao;
    }

    /**
     * Define o valor da propriedade dataExpiracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExpiracao(String value) {
        this.dataExpiracao = value;
    }

    /**
     * Obtém o valor da propriedade bloquear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloquear() {
        return bloquear;
    }

    /**
     * Define o valor da propriedade bloquear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloquear(String value) {
        this.bloquear = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
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

    /**
     * Obtém o valor da propriedade politiEntrega.
     * 
     * @return
     *     possible object is
     *     {@link PoliticaEntregaType }
     *     
     */
    public PoliticaEntregaType getPolitiEntrega() {
        return politiEntrega;
    }

    /**
     * Define o valor da propriedade politiEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticaEntregaType }
     *     
     */
    public void setPolitiEntrega(PoliticaEntregaType value) {
        this.politiEntrega = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserType }
     * 
     * 
     */
    public List<UserType> getUsuario() {
        if (usuario == null) {
            usuario = new ArrayList<UserType>();
        }
        return this.usuario;
    }

    /**
     * Gets the value of the localType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalType }
     * 
     * 
     */
    public List<LocalType> getLocalType() {
        if (localType == null) {
            localType = new ArrayList<LocalType>();
        }
        return this.localType;
    }

    /**
     * Obtém o valor da propriedade anuncioId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnuncioId() {
        return anuncioId;
    }

    /**
     * Define o valor da propriedade anuncioId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnuncioId(Long value) {
        this.anuncioId = value;
    }

    /**
     * Obtém o valor da propriedade userId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Define o valor da propriedade userId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Obtém o valor da propriedade localId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocalId() {
        return localId;
    }

    /**
     * Define o valor da propriedade localId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocalId(Long value) {
        this.localId = value;
    }

}
