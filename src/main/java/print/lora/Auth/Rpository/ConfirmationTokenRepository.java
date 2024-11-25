package print.lora.Auth.Rpository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import print.lora.Auth.Model.Token;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface ConfirmationTokenRepository
        extends JpaRepository<Token, Long> {

    Optional<Token> findByToken(String token);

    @Transactional
    @Modifying
    @Query("UPDATE Token c " +
            "SET c.confirmedAt = ?2, c.confirmed = true " +
            "WHERE c.token = ?1")
    int updateConfirmedAt(String token, LocalDateTime confirmedAt);
    @Transactional
    void deleteByAppUserId(Long appUserId);

}