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
import javax.xml.bind.annotation.XmlType;


/**
// <<<<<<< HEAD
 * <p>Classe Java de AnuncioType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
=======
 * <p>Java class for AnuncioType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
>>>>>>> olivio
 * 
 * <pre>
 * &lt;complexType name="AnuncioType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataExpiracao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usuario" type="{http://anuncios.soap.xml}UserType" minOccurs="0"/&gt;
 *         &lt;element name="local" type="{http://anuncios.soap.xml}LocalType" minOccurs="0"/&gt;
 *         &lt;element name="anuncioId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "dataInicio",
    "descricao",
    "dataExpiracao",
    "usuario",
    "local",
    "anuncioId"
})
public class AnuncioType {

    protected int id;
    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected String dataInicio;
    @XmlElement(required = true)
    protected String descricao;
    @XmlElement(required = true)
    protected String dataExpiracao;
    protected UserType usuario;
    protected LocalType local;
    protected Long anuncioId;

    /**
// <<<<<<< HEAD
     * Obtém o valor da propriedade id.
=======
     * Gets the value of the id property.
>>>>>>> olivio
     * 
     */
    public int getId() {
        return id;
    }

    /**
// <<<<<<< HEAD
     * Define o valor da propriedade id.
=======
     * Sets the value of the id property.
>>>>>>> olivio
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
// <<<<<<< HEAD
     * Obtém o valor da propriedade titulo.
=======
     * Gets the value of the titulo property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Define o valor da propriedade titulo.
=======
     * Sets the value of the titulo property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Obtém o valor da propriedade dataInicio.
=======
     * Gets the value of the dataInicio property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Define o valor da propriedade dataInicio.
=======
     * Sets the value of the dataInicio property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Obtém o valor da propriedade descricao.
=======
     * Gets the value of the descricao property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Define o valor da propriedade descricao.
=======
     * Sets the value of the descricao property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Obtém o valor da propriedade dataExpiracao.
=======
     * Gets the value of the dataExpiracao property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Define o valor da propriedade dataExpiracao.
=======
     * Sets the value of the dataExpiracao property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Obtém o valor da propriedade usuario.
=======
     * Gets the value of the usuario property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Define o valor da propriedade usuario.
=======
     * Sets the value of the usuario property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Obtém o valor da propriedade local.
=======
     * Gets the value of the local property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Define o valor da propriedade local.
=======
     * Sets the value of the local property.
>>>>>>> olivio
     * 
     * @param value
     *     allowed object is
     *     {@link LocalType }
     *     
     */
    public void setLocal(LocalType value) {
        this.local = value;
    }

    /**
// <<<<<<< HEAD
     * Obtém o valor da propriedade anuncioId.
=======
     * Gets the value of the anuncioId property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Define o valor da propriedade anuncioId.
=======
     * Sets the value of the anuncioId property.
>>>>>>> olivio
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnuncioId(Long value) {
        this.anuncioId = value;
    }

}
