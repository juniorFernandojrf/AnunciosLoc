//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.20 às 09:56:59 PM WAT 
//


package xml.soap.interesses;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml.soap.interesses package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml.soap.interesses
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllInteressesRequest }
     * 
     */
    public AllInteressesRequest createAllInteressesRequest() {
        return new AllInteressesRequest();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link AllInteressesResponse }
     * 
     */
    public AllInteressesResponse createAllInteressesResponse() {
        return new AllInteressesResponse();
    }

    /**
     * Create an instance of {@link InteressesType }
     * 
     */
    public InteressesType createInteressesType() {
        return new InteressesType();
    }

}
