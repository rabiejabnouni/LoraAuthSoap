package print.lora.Auth.Service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import print.lora.Auth.Model.Token;
import print.lora.Auth.Rpository.ConfirmationTokenRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final ConfirmationTokenRepository confirmationTokenRepository;

    public void saveConfirmationToken(Token token) {
        confirmationTokenRepository.save(token);
    }

    public Optional<Token> getToken(String token) {
        return confirmationTokenRepository.findByToken(token);
    }

    public int setConfirmedAt(String token) {
        return confirmationTokenRepository.updateConfirmedAt(
                token, LocalDateTime.now());

    }
}
