package print.lora.Auth.Service;


import com.example.users.GoogleLoginRequest;
import com.example.users.GoogleLoginResponse;
import com.example.users.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import print.lora.Auth.Model.AppUser;
import print.lora.Auth.Model.Token;
import print.lora.Auth.Rpository.AppUserRepository;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class GoogleTokenValidator {

    @Value("${google.client-id}")
    private String googleClientId;

    @Autowired
    private ConfirmationTokenService confirmationTokenService;
    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private RegistrationService registrationService;

    public GoogleLoginResponse loginWithApiGoogle(GoogleLoginRequest request) {
        String email= request.getEmail();
        System.out.println(email);
        AppUser user = appUserRepository.findByEmail(email).get();
        if (user == null) {
            throw new RuntimeException("you not have a compte");
        }
        String newToken = UUID.randomUUID().toString();

        // Créer un nouvel objet ConfirmationToken
       Token token = new Token(
                newToken,
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(15),
                user
        );
        confirmationTokenService.saveConfirmationToken(token);
       registrationService.confirmToken(newToken);
        GoogleLoginResponse confirmationToken = new GoogleLoginResponse();
        confirmationToken.setMessage(newToken);
        return confirmationToken ;
    }
}
