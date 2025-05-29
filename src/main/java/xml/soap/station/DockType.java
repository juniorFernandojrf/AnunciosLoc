//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.27 às 11:12:22 AM WAT 
//


package xml.soap.station;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DockType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DockType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idDock" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DockType", propOrder = {
    "idDock",
    "reference",
    "state",
    "info"
})
public class DockType {

    protected long idDock;
    @XmlElement(required = true)
    protected String reference;
    protected int state;
    @XmlElement(required = true)
    protected String info;

    /**
     * Obtém o valor da propriedade idDock.
     * 
     */
    public long getIdDock() {
        return idDock;
    }

    /**
     * Define o valor da propriedade idDock.
     * 
     */
    public void setIdDock(long value) {
        this.idDock = value;
    }

    /**
     * Obtém o valor da propriedade reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Define o valor da propriedade reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Obtém o valor da propriedade state.
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * Define o valor da propriedade state.
     * 
     */
    public void setState(int value) {
        this.state = value;
    }

    /**
     * Obtém o valor da propriedade info.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Define o valor da propriedade info.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

}
