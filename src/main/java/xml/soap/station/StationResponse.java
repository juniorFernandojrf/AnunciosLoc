//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.27 às 11:12:22 AM WAT 
//


package xml.soap.station;

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
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bonus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="qtdDocks" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="qtdDocksDispo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="localName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="distrito" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="avenida" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="dockItem" type="{http://station.soap.xml}DockType" maxOccurs="unbounded"/&gt;
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
    "estado",
    "mensagem",
    "stateCode",
    "id",
    "name",
    "bonus",
    "qtdDocks",
    "qtdDocksDispo",
    "localName",
    "pais",
    "provincia",
    "municipio",
    "distrito",
    "avenida",
    "latitude",
    "longitude",
    "dockItem"
})
@XmlRootElement(name = "StationResponse")
public class StationResponse {

    protected boolean estado;
    @XmlElement(required = true)
    protected String mensagem;
    protected int stateCode;
    protected long id;
    @XmlElement(required = true)
    protected String name;
    protected int bonus;
    protected int qtdDocks;
    protected int qtdDocksDispo;
    @XmlElement(required = true)
    protected String localName;
    @XmlElement(required = true)
    protected String pais;
    @XmlElement(required = true)
    protected String provincia;
    @XmlElement(required = true)
    protected String municipio;
    @XmlElement(required = true)
    protected String distrito;
    @XmlElement(required = true)
    protected String avenida;
    protected float latitude;
    protected float longitude;
    @XmlElement(required = true)
    protected List<DockType> dockItem;

    /**
     * Obtém o valor da propriedade estado.
     * 
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Define o valor da propriedade estado.
     * 
     */
    public void setEstado(boolean value) {
        this.estado = value;
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
     * Obtém o valor da propriedade stateCode.
     * 
     */
    public int getStateCode() {
        return stateCode;
    }

    /**
     * Define o valor da propriedade stateCode.
     * 
     */
    public void setStateCode(int value) {
        this.stateCode = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade bonus.
     * 
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * Define o valor da propriedade bonus.
     * 
     */
    public void setBonus(int value) {
        this.bonus = value;
    }

    /**
     * Obtém o valor da propriedade qtdDocks.
     * 
     */
    public int getQtdDocks() {
        return qtdDocks;
    }

    /**
     * Define o valor da propriedade qtdDocks.
     * 
     */
    public void setQtdDocks(int value) {
        this.qtdDocks = value;
    }

    /**
     * Obtém o valor da propriedade qtdDocksDispo.
     * 
     */
    public int getQtdDocksDispo() {
        return qtdDocksDispo;
    }

    /**
     * Define o valor da propriedade qtdDocksDispo.
     * 
     */
    public void setQtdDocksDispo(int value) {
        this.qtdDocksDispo = value;
    }

    /**
     * Obtém o valor da propriedade localName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Define o valor da propriedade localName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalName(String value) {
        this.localName = value;
    }

    /**
     * Obtém o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtém o valor da propriedade provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Define o valor da propriedade provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Obtém o valor da propriedade municipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Define o valor da propriedade municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Obtém o valor da propriedade distrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Define o valor da propriedade distrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrito(String value) {
        this.distrito = value;
    }

    /**
     * Obtém o valor da propriedade avenida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvenida() {
        return avenida;
    }

    /**
     * Define o valor da propriedade avenida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvenida(String value) {
        this.avenida = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the dockItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dockItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDockItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DockType }
     * 
     * 
     */
    public List<DockType> getDockItem() {
        if (dockItem == null) {
            dockItem = new ArrayList<DockType>();
        }
        return this.dockItem;
    }

}
