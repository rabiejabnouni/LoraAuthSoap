package print.lora.Auth.Service;

import com.example.users.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import print.lora.Auth.Model.AppUser;
import print.lora.Auth.Rpository.AppUserRepository;
import print.lora.Auth.Rpository.ConfirmationTokenRepository;

import java.time.LocalDate;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private AppUserRepository appUserRepository;
    @Autowired
    private ConfirmationTokenRepository confirmationTokenRepository;
    @Autowired
    private ConfirmationTokenService confirmationTokenService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    public AppUser getUserById(Long id) {
        return appUserRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found with ID: " + id));
    }
    public User getUserByEmail(GetByEmail request) {
        String email = request.getEmail();
        AppUser user=appUserRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("User not found with email: " + email));
         return this.AppUserToUser(user);
    }
    public GetAll GetAll(){
        GetAll allUser= new GetAll();
        List<AppUser> userList = appUserRepository.findAll();
        for (AppUser appUser:userList){
            allUser.getUser().add(this.AppUserToUser(appUser));
        }
        return allUser;
    }
    private User AppUserToUser(AppUser appUser) {
        User user = new User();
        user.setFirstName(appUser.getFirstName());
        user.setLastName(appUser.getLastName());
        user.setEmail(appUser.getEmail());
        user.setAppUserRole(appUser.getAppUserRole().name());
        user.setLocked(appUser.getLocked());
        user.setEnabled(appUser.getEnabled());
        user.setImageProfilPath(appUser.getImageProfilPath());

        if (appUser.getBirthDay() != null) {
            BirthDay birthDay = new BirthDay();
            birthDay.setDay(appUser.getBirthDay().getDayOfMonth());
            birthDay.setMonth(appUser.getBirthDay().getMonthValue());
            birthDay.setYear(appUser.getBirthDay().getYear());
            user.setBirthDay(birthDay);
        }

        return user;
    }

    public Response updateUser(DeleteById iD, User updatedUser) {
        long id= iD.getId();
        AppUser existingUser = getUserById(id);
        existingUser.setLocked(updatedUser.isLocked());

        existingUser.setEnabled(updatedUser.isEnabled());
        LocalDate birthDay = LocalDate.of(
                updatedUser.getBirthDay().getYear(),
                updatedUser.getBirthDay().getMonth(),
                updatedUser.getBirthDay().getDay()
        );
        existingUser.setFirstName(updatedUser.getFirstName());
        existingUser.setLastName(updatedUser.getLastName());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setBirthDay(birthDay);

        existingUser.setImageProfilPath(updatedUser.getImageProfilPath());

       appUserRepository.save(existingUser);
       Response response=new Response();
       response.setMessage("ok");
        return response;
    }

    // Supprimer un utilisateur par ID
    public Response deleteUserById(DeleteById request) {
        long id = request.getId();
        AppUser user = getUserById(id);
        confirmationTokenRepository.deleteByAppUserId(user.getId()); // Supprime les tokens liés
        appUserRepository.delete(user);
        Response response=new Response();
        response.setMessage(String.valueOf(user.getId()));
        return response;
    }

    public Response findIdUser(GetByEmail request) {
        AppUser user=appUserRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("User not found with email: " + request.getEmail()));
        Response response=new Response();
        response.setMessage(String.valueOf(user.getId()));
        return response;
    }
    public long idUser(GetByEmail request) {
        AppUser user=appUserRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("User not found with email: " + request.getEmail()));
        return user.getId();
    }
}
