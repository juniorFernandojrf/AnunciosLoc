//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.19 às 10:16:38 AM WAT 
//


package xml.soap.anuncios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PoliticaEntregaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PoliticaEntregaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="titulo" type="{http://anuncios.soap.xml}PoliticaTipo"/&gt;
 *         &lt;element name="condicoes" type="{http://anuncios.soap.xml}CondicaoPerfilType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoliticaEntregaType", propOrder = {
    "titulo",
    "condicoes"
})
public class PoliticaEntregaType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PoliticaTipo titulo;
    protected List<CondicaoPerfilType> condicoes;

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link PoliticaTipo }
     *     
     */
    public PoliticaTipo getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticaTipo }
     *     
     */
    public void setTitulo(PoliticaTipo value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the condicoes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condicoes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondicoes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CondicaoPerfilType }
     * 
     * 
     */
    public List<CondicaoPerfilType> getCondicoes() {
        if (condicoes == null) {
            condicoes = new ArrayList<CondicaoPerfilType>();
        }
        return this.condicoes;
    }

}
