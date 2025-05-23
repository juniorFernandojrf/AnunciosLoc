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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AnuncioType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AnuncioType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataexpiracao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bloquear" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="usuario" type="{http://anuncios.soap.xml}UserType" minOccurs="0"/&gt;
 *         &lt;element name="local" type="{http://anuncios.soap.xml}LocalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnuncioType", propOrder = {
    "id",
    "titulo",
    "descricao",
    "dataexpiracao",
    "bloquear",
    "userId",
    "localId",
    "usuario",
    "local"
})
public class AnuncioType {

    protected int id;
    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected String descricao;
    @XmlElement(required = true)
    protected String dataexpiracao;
    protected boolean bloquear;
    protected long userId;
    protected long localId;
    protected UserType usuario;
    protected LocalType local;

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

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUsuario(UserType value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link LocalType }
     *     
     */
    public LocalType getLocal() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalType }
     *     
     */
    public void setLocal(LocalType value) {
        this.local = value;
    }

}
