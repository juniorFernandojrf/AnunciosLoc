//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.17 às 12:40:32 PM WAT 
//


package xml.soap.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PartidaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PartidaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartidaType", propOrder = {
    "estacao",
    "latitude",
    "longitude",
    "data"
})
public class PartidaType {

    @XmlElement(required = true)
    protected String estacao;
    protected double latitude;
    protected double longitude;
    @XmlElement(required = true)
    protected String data;

    /**
     * Obtém o valor da propriedade estacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstacao() {
        return estacao;
    }

    /**
     * Define o valor da propriedade estacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstacao(String value) {
        this.estacao = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

}
