package print.lora.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/ws/**").permitAll()
                        .requestMatchers("/api/**").permitAll()
                        .anyRequest().authenticated()  // Exiger l'authentification pour d'autres requêtes
                )
                .csrf(csrf -> csrf.disable()); // Désactiver CSRF pour SOAP
        return http.build();
    }
}

