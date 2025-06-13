//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.11 às 01:13:46 PM WAT 
//


package xml.soap.station;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "stateCode"
})
@XmlRootElement(name = "AddDockResp")
public class AddDockResp {

    protected boolean estado;
    @XmlElement(required = true)
    protected String mensagem;
    protected int stateCode;

    /**
     // * Obtém o valor da propriedade estado.
     * 
     */
    public boolean isEstado() {
        return estado;
    }

    /**
// <<<<<<< HEAD
     * Define o valor da propriedade estado.
=======
     * Sets the value of the estado property.
>>>>>>> olivio
     * 
     */
    public void setEstado(boolean value) {
        this.estado = value;
    }

    /**
// <<<<<<< HEAD
     * Obtém o valor da propriedade mensagem.
=======
     * Gets the value of the mensagem property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Define o valor da propriedade mensagem.
=======
     * Sets the value of the mensagem property.
>>>>>>> olivio
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
// <<<<<<< HEAD
     * Obtém o valor da propriedade stateCode.
=======
     * Gets the value of the stateCode property.
>>>>>>> olivio
     * 
     */
    public int getStateCode() {
        return stateCode;
    }

    /**
// <<<<<<< HEAD
     * Define o valor da propriedade stateCode.
=======
     * Sets the value of the stateCode property.
>>>>>>> olivio
     * 
     */
    public void setStateCode(int value) {
        this.stateCode = value;
    }

}
