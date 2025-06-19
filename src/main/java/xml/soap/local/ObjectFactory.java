//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.19 às 01:36:48 PM WAT 
//


package xml.soap.local;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml.soap.local package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml.soap.local
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddLocalRequest }
     * 
     */
    public AddLocalRequest createAddLocalRequest() {
        return new AddLocalRequest();
    }

    /**
     * Create an instance of {@link AddLocalResponse }
     * 
     */
    public AddLocalResponse createAddLocalResponse() {
        return new AddLocalResponse();
    }

    /**
     * Create an instance of {@link RemoveLocalRequest }
     * 
     */
    public RemoveLocalRequest createRemoveLocalRequest() {
        return new RemoveLocalRequest();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link AddLocalRequest.Body }
     * 
     */
    public AddLocalRequest.Body createAddLocalRequestBody() {
        return new AddLocalRequest.Body();
    }

    /**
     * Create an instance of {@link AddLocalResponse.Body }
     * 
     */
    public AddLocalResponse.Body createAddLocalResponseBody() {
        return new AddLocalResponse.Body();
    }

    /**
     * Create an instance of {@link AllLocalRequest }
     * 
     */
    public AllLocalRequest createAllLocalRequest() {
        return new AllLocalRequest();
    }

    /**
     * Create an instance of {@link AllLocalResponse }
     * 
     */
    public AllLocalResponse createAllLocalResponse() {
        return new AllLocalResponse();
    }

    /**
     * Create an instance of {@link LocalType }
     * 
     */
    public LocalType createLocalType() {
        return new LocalType();
    }

    /**
     * Create an instance of {@link RemoveLocalRequest.Body }
     * 
     */
    public RemoveLocalRequest.Body createRemoveLocalRequestBody() {
        return new RemoveLocalRequest.Body();
    }

    /**
     * Create an instance of {@link RemoveLocalResponse }
     * 
     */
    public RemoveLocalResponse createRemoveLocalResponse() {
        return new RemoveLocalResponse();
    }

}
