//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.16 às 07:15:31 PM WAT 
//


package xml.soap.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TrajectType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TrajectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partida" type="{http://user.soap.xml}PartidaType"/&gt;
 *         &lt;element name="chegada" type="{http://user.soap.xml}ChegadaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrajectType", propOrder = {
    "partida",
    "chegada"
})
public class TrajectType {

    @XmlElement(required = true)
    protected PartidaType partida;
    @XmlElement(required = true)
    protected ChegadaType chegada;

    /**
     * Obtém o valor da propriedade partida.
     * 
     * @return
     *     possible object is
     *     {@link PartidaType }
     *     
     */
    public PartidaType getPartida() {
        return partida;
    }

    /**
     * Define o valor da propriedade partida.
     * 
     * @param value
     *     allowed object is
     *     {@link PartidaType }
     *     
     */
    public void setPartida(PartidaType value) {
        this.partida = value;
    }

    /**
     * Obtém o valor da propriedade chegada.
     * 
     * @return
     *     possible object is
     *     {@link ChegadaType }
     *     
     */
    public ChegadaType getChegada() {
        return chegada;
    }

    /**
     * Define o valor da propriedade chegada.
     * 
     * @param value
     *     allowed object is
     *     {@link ChegadaType }
     *     
     */
    public void setChegada(ChegadaType value) {
        this.chegada = value;
    }

}
