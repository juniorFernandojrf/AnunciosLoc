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
 *         &lt;element name="Header" type="{http://user.soap.xml}HeaderType"/&gt;
 *         &lt;element name="Body"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="foto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="profissao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "header",
    "body"
})
@XmlRootElement(name = "AddUserRequest")
public class AddUserRequest {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Body", required = true)
    protected AddUserRequest.Body body;

    /**
     * Obtém o valor da propriedade header.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Define o valor da propriedade header.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Obtém o valor da propriedade body.
     * 
     * @return
     *     possible object is
     *     {@link AddUserRequest.Body }
     *     
     */
    public AddUserRequest.Body getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link AddUserRequest.Body }
     *     
     */
    public void setBody(AddUserRequest.Body value) {
        this.body = value;
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
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="foto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="profissao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "email",
        "password",
        "username",
        "genero",
        "foto",
        "tipo",
        "profissao",
        "telefone"
    })
    public static class Body {

        @XmlElement(required = true)
        protected String email;
        @XmlElement(required = true)
        protected String password;
        @XmlElement(required = true)
        protected String username;
        @XmlElement(required = true)
        protected String genero;
        @XmlElement(required = true)
        protected String foto;
        protected int tipo;
        @XmlElement(required = true)
        protected String profissao;
        @XmlElement(required = true)
        protected String telefone;

        /**
         * Obtém o valor da propriedade email.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Define o valor da propriedade email.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Obtém o valor da propriedade password.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Define o valor da propriedade password.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Obtém o valor da propriedade username.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Define o valor da propriedade username.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Obtém o valor da propriedade genero.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenero() {
            return genero;
        }

        /**
         * Define o valor da propriedade genero.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenero(String value) {
            this.genero = value;
        }

        /**
         * Obtém o valor da propriedade foto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFoto() {
            return foto;
        }

        /**
         * Define o valor da propriedade foto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFoto(String value) {
            this.foto = value;
        }

        /**
         * Obtém o valor da propriedade tipo.
         * 
         */
        public int getTipo() {
            return tipo;
        }

        /**
         * Define o valor da propriedade tipo.
         * 
         */
        public void setTipo(int value) {
            this.tipo = value;
        }

        /**
         * Obtém o valor da propriedade profissao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfissao() {
            return profissao;
        }

        /**
         * Define o valor da propriedade profissao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfissao(String value) {
            this.profissao = value;
        }

        /**
         * Obtém o valor da propriedade telefone.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefone() {
            return telefone;
        }

        /**
         * Define o valor da propriedade telefone.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefone(String value) {
            this.telefone = value;
        }

    }

}
