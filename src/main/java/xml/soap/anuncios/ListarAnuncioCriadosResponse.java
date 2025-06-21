//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.21 às 09:19:46 PM WAT 
//


package xml.soap.anuncios;

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
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="usuario" type="{http://anuncios.soap.xml}UserType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="anuncios" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="anuncio" type="{http://anuncios.soap.xml}AnuncioType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="qtdAnuncio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "mensagem",
    "estado",
    "usuario",
    "anuncios",
    "qtdAnuncio"
})
@XmlRootElement(name = "ListarAnuncioCriadosResponse")
public class ListarAnuncioCriadosResponse {

    @XmlElement(required = true)
    protected String mensagem;
    protected boolean estado;
    protected List<UserType> usuario;
    protected ListarAnuncioCriadosResponse.Anuncios anuncios;
    protected Long qtdAnuncio;

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
     * Gets the value of the usuario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserType }
     * 
     * 
     */
    public List<UserType> getUsuario() {
        if (usuario == null) {
            usuario = new ArrayList<UserType>();
        }
        return this.usuario;
    }

    /**
     * Obtém o valor da propriedade anuncios.
     * 
     * @return
     *     possible object is
     *     {@link ListarAnuncioCriadosResponse.Anuncios }
     *     
     */
    public ListarAnuncioCriadosResponse.Anuncios getAnuncios() {
        return anuncios;
    }

    /**
     * Define o valor da propriedade anuncios.
     * 
     * @param value
     *     allowed object is
     *     {@link ListarAnuncioCriadosResponse.Anuncios }
     *     
     */
    public void setAnuncios(ListarAnuncioCriadosResponse.Anuncios value) {
        this.anuncios = value;
    }

    /**
     * Obtém o valor da propriedade qtdAnuncio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQtdAnuncio() {
        return qtdAnuncio;
    }

    /**
     * Define o valor da propriedade qtdAnuncio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQtdAnuncio(Long value) {
        this.qtdAnuncio = value;
    }


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
     *         &lt;element name="anuncio" type="{http://anuncios.soap.xml}AnuncioType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "anuncio"
    })
    public static class Anuncios {

        protected List<AnuncioType> anuncio;

        /**
         * Gets the value of the anuncio property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the anuncio property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnuncio().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AnuncioType }
         * 
         * 
         */
        public List<AnuncioType> getAnuncio() {
            if (anuncio == null) {
                anuncio = new ArrayList<AnuncioType>();
            }
            return this.anuncio;
        }

    }

}
