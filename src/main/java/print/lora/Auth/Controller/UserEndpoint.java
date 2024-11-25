package print.lora.Auth.Controller;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import com.example.users.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import print.lora.Auth.Service.*;

@Endpoint
@Component
@NoArgsConstructor
public class UserEndpoint {
    @Autowired
    private LoginService loginService;

    @Autowired
    private UserService userService;
    @Autowired
    private GoogleTokenValidator googleTokenValidator;

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private ForgetService forgetService;
    private static final String NAMESPACE_URI = "http://example.com/users";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "LoginWithGoogleRequest")
    @ResponsePayload
    public GoogleLoginResponse loginWithGoogle(@RequestPayload GoogleLoginRequest request) {
        System.out.println(request);
        return googleTokenValidator.loginWithApiGoogle(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "LoginRequest")
    @ResponsePayload
    public Response login(@RequestPayload LoginRequest request) {

        System.out.println(request.getEmail());
        return loginService.login(request);
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "RegistrationRequest")
    @ResponsePayload
    public Response register(@RequestPayload RegistrationRequest request){
        return  registrationService.register(request);
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConfirmeToken")
    @ResponsePayload
    public Response confirme(@RequestPayload ConfirmeToken request){
        System.out.println(request.getToken());
        String token= request.getToken();
        return  registrationService.confirmToken(token);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ForgetRequest")
    @ResponsePayload
    public Response forget(@RequestPayload ForgetRequest request){

     return forgetService.forget(request);
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdatePasswordRequest")
    @ResponsePayload
    public Response UpdatePassword(@RequestPayload UpdatePasswordRequest request){

        return forgetService.updatePassword(request);
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetAll")
    @ResponsePayload
    public GetAll GetAll(){

        return userService.GetAll();
    }
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "GetByEmail")
    @ResponsePayload
    public  Response findId(@RequestPayload GetByEmail request){
        return  userService.findIdUser(request);
    }
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "DeleteById")
    @ResponsePayload
    public  Response delete(@RequestPayload DeleteById request){
        return  userService.deleteUserById(request);
    }

}
