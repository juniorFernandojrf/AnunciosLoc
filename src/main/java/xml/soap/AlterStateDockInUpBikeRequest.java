//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.20 às 09:56:59 PM WAT 
//


package xml.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="idDock" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "idDock",
    "state"
})
@XmlRootElement(name = "AlterStateDockInUpBikeRequest")
public class AlterStateDockInUpBikeRequest {

    protected long idDock;
    protected int state;

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

}
