//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.21 às 09:19:46 PM WAT 
//


package xml.soap.conta;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml.soap.conta package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml.soap.conta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarSaldoRequest }
     * 
     */
    public ConsultarSaldoRequest createConsultarSaldoRequest() {
        return new ConsultarSaldoRequest();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link ConsultarSaldoRequest.Body }
     * 
     */
    public ConsultarSaldoRequest.Body createConsultarSaldoRequestBody() {
        return new ConsultarSaldoRequest.Body();
    }

    /**
     * Create an instance of {@link ConsultarSaldoResponse }
     * 
     */
    public ConsultarSaldoResponse createConsultarSaldoResponse() {
        return new ConsultarSaldoResponse();
    }

    /**
     * Create an instance of {@link UsuarioConta }
     * 
     */
    public UsuarioConta createUsuarioConta() {
        return new UsuarioConta();
    }

}
