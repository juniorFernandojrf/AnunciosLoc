//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.17 às 12:40:32 PM WAT 
//


package xml.soap.user;

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
 *         &lt;element name="trajectList" type="{http://user.soap.xml}TrajectType" maxOccurs="unbounded"/&gt;
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
    "trajectList"
})
@XmlRootElement(name = "HistoricTrajectResponse")
public class HistoricTrajectResponse {

    protected boolean estado;
    @XmlElement(required = true)
    protected String mensagem;
    protected int stateCode;
    @XmlElement(required = true)
    protected List<TrajectType> trajectList;

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
     * Gets the value of the trajectList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trajectList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrajectList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrajectType }
     * 
     * 
     */
    public List<TrajectType> getTrajectList() {
        if (trajectList == null) {
            trajectList = new ArrayList<TrajectType>();
        }
        return this.trajectList;
    }

}
