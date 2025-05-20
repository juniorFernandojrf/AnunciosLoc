//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.20 às 04:20:46 PM WAT 
//


package xml.soap.user;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml.soap.user package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml.soap.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddUserRequest }
     * 
     */
    public AddUserRequest createAddUserRequest() {
        return new AddUserRequest();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetUserRequest }
     * 
     */
    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    /**
     * Create an instance of {@link LogoutRequest }
     * 
     */
    public LogoutRequest createLogoutRequest() {
        return new LogoutRequest();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link ValidateTokenRequest }
     * 
     */
    public ValidateTokenRequest createValidateTokenRequest() {
        return new ValidateTokenRequest();
    }

    /**
     * Create an instance of {@link ValidateTokenResponse }
     * 
     */
    public ValidateTokenResponse createValidateTokenResponse() {
        return new ValidateTokenResponse();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link AddUserRequest.Body }
     * 
     */
    public AddUserRequest.Body createAddUserRequestBody() {
        return new AddUserRequest.Body();
    }

    /**
     * Create an instance of {@link LoginResponse.User }
     * 
     */
    public LoginResponse.User createLoginResponseUser() {
        return new LoginResponse.User();
    }

    /**
     * Create an instance of {@link GetUserRequest.Body }
     * 
     */
    public GetUserRequest.Body createGetUserRequestBody() {
        return new GetUserRequest.Body();
    }

    /**
     * Create an instance of {@link UserResponse }
     * 
     */
    public UserResponse createUserResponse() {
        return new UserResponse();
    }

    /**
     * Create an instance of {@link AllUsersRequest }
     * 
     */
    public AllUsersRequest createAllUsersRequest() {
        return new AllUsersRequest();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

}
