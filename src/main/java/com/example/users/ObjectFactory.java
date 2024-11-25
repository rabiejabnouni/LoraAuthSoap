//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.11.24 à 11:55:18 PM CET 
//


package com.example.users;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.users package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.users
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link RegistrationRequest }
     * 
     */
    public RegistrationRequest createRegistrationRequest() {
        return new RegistrationRequest();
    }

    /**
     * Create an instance of {@link UpdatePasswordRequest }
     * 
     */
    public UpdatePasswordRequest createUpdatePasswordRequest() {
        return new UpdatePasswordRequest();
    }

    /**
     * Create an instance of {@link ConfirmeToken }
     * 
     */
    public ConfirmeToken createConfirmeToken() {
        return new ConfirmeToken();
    }

    /**
     * Create an instance of {@link ForgetRequest }
     * 
     */
    public ForgetRequest createForgetRequest() {
        return new ForgetRequest();
    }

    /**
     * Create an instance of {@link GoogleLoginRequest }
     * 
     */
    public GoogleLoginRequest createGoogleLoginRequest() {
        return new GoogleLoginRequest();
    }

    /**
     * Create an instance of {@link GoogleLoginResponse }
     * 
     */
    public GoogleLoginResponse createGoogleLoginResponse() {
        return new GoogleLoginResponse();
    }

    /**
     * Create an instance of {@link DeleteById }
     * 
     */
    public DeleteById createDeleteById() {
        return new DeleteById();
    }

    /**
     * Create an instance of {@link GetByEmail }
     * 
     */
    public GetByEmail createGetByEmail() {
        return new GetByEmail();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link BirthDay }
     * 
     */
    public BirthDay createBirthDay() {
        return new BirthDay();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

}
