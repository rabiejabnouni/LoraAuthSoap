package print.lora.Auth.Controller;

import com.example.users.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import print.lora.Auth.Service.RegistrationService;

@RestController
@RequestMapping(path = "/api")
public class ConfirmTokenController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/confirm")
    public Response confirm(@RequestParam String token) {
            System.out.println("Received token: " + token);
        return registrationService.confirmToken(token);
    }
}
