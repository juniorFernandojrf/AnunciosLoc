//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.19 às 01:36:48 PM WAT 
//


package xml.soap.uddi;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml.soap.uddi package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml.soap.uddi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrerServiceRequest }
     * 
     */
    public RegistrerServiceRequest createRegistrerServiceRequest() {
        return new RegistrerServiceRequest();
    }

    /**
     * Create an instance of {@link RegistrerServiceResponse }
     * 
     */
    public RegistrerServiceResponse createRegistrerServiceResponse() {
        return new RegistrerServiceResponse();
    }

    /**
     * Create an instance of {@link GetServicesRequest }
     * 
     */
    public GetServicesRequest createGetServicesRequest() {
        return new GetServicesRequest();
    }

    /**
     * Create an instance of {@link ServicesListResponse }
     * 
     */
    public ServicesListResponse createServicesListResponse() {
        return new ServicesListResponse();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

}
