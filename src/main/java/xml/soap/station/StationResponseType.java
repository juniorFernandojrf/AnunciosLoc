//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.20 às 09:56:59 PM WAT 
//


package xml.soap.station;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StationResponseType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bonus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Docks" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DocksDisp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="localName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="distrito" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="avenida" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="distancia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationResponseType", propOrder = {
    "id",
    "name",
    "bonus",
    "docks",
    "docksDisp",
    "localName",
    "pais",
    "provincia",
    "municipio",
    "distrito",
    "avenida",
    "latitude",
    "longitude",
    "distancia"
})
public class StationResponseType {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    protected int bonus;
    @XmlElement(name = "Docks")
    protected int docks;
    @XmlElement(name = "DocksDisp")
    protected int docksDisp;
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
    protected int distancia;

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
     * Obtém o valor da propriedade docks.
     * 
     */
    public int getDocks() {
        return docks;
    }

    /**
     * Define o valor da propriedade docks.
     * 
     */
    public void setDocks(int value) {
        this.docks = value;
    }

    /**
     * Obtém o valor da propriedade docksDisp.
     * 
     */
    public int getDocksDisp() {
        return docksDisp;
    }

    /**
     * Define o valor da propriedade docksDisp.
     * 
     */
    public void setDocksDisp(int value) {
        this.docksDisp = value;
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
     * Obtém o valor da propriedade distancia.
     * 
     */
    public int getDistancia() {
        return distancia;
    }

    /**
     * Define o valor da propriedade distancia.
     * 
     */
    public void setDistancia(int value) {
        this.distancia = value;
    }

}
