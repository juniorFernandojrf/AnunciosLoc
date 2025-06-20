//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.06.20 às 09:56:59 PM WAT 
//


package xml.soap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml.soap package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStationRequest }
     * 
     */
    public GetStationRequest createGetStationRequest() {
        return new GetStationRequest();
    }

    /**
     * Create an instance of {@link AddDockRequest }
     * 
     */
    public AddDockRequest createAddDockRequest() {
        return new AddDockRequest();
    }

    /**
     * Create an instance of {@link AddDockResponse }
     * 
     */
    public AddDockResponse createAddDockResponse() {
        return new AddDockResponse();
    }

    /**
     * Create an instance of {@link DeleteDockRequest }
     * 
     */
    public DeleteDockRequest createDeleteDockRequest() {
        return new DeleteDockRequest();
    }

    /**
     * Create an instance of {@link DeleteDockResponse }
     * 
     */
    public DeleteDockResponse createDeleteDockResponse() {
        return new DeleteDockResponse();
    }

    /**
     * Create an instance of {@link GetStationResponse }
     * 
     */
    public GetStationResponse createGetStationResponse() {
        return new GetStationResponse();
    }

    /**
     * Create an instance of {@link DockType }
     * 
     */
    public DockType createDockType() {
        return new DockType();
    }

    /**
     * Create an instance of {@link AlterStateDockInUpBikeRequest }
     * 
     */
    public AlterStateDockInUpBikeRequest createAlterStateDockInUpBikeRequest() {
        return new AlterStateDockInUpBikeRequest();
    }

    /**
     * Create an instance of {@link AlterStateDockInUpBikeResponse }
     * 
     */
    public AlterStateDockInUpBikeResponse createAlterStateDockInUpBikeResponse() {
        return new AlterStateDockInUpBikeResponse();
    }

    /**
     * Create an instance of {@link AlterStateDockInDownBikeRequest }
     * 
     */
    public AlterStateDockInDownBikeRequest createAlterStateDockInDownBikeRequest() {
        return new AlterStateDockInDownBikeRequest();
    }

    /**
     * Create an instance of {@link AlterStateDockInDownBikeResponse }
     * 
     */
    public AlterStateDockInDownBikeResponse createAlterStateDockInDownBikeResponse() {
        return new AlterStateDockInDownBikeResponse();
    }

}
