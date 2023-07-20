package proj.example.RegisterAndLogin.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import proj.example.RegisterAndLogin.DTO;
import proj.example.RegisterAndLogin.LoginDto;
import proj.example.RegisterAndLogin.LoginMessage;
import proj.example.RegisterAndLogin.UserEntity;
import proj.example.RegisterAndLogin.UserRepo;

@Service


public class Userimpl implements UserService{

 @Autowired
 private UserRepo UserRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String addEmployee(DTO employeeDTO) {

        UserEntity employee = new UserEntity(

                employeeDTO.getId(),
                employeeDTO.getName(),
                employeeDTO.getEmail(),

               this.passwordEncoder.encode(employeeDTO.getPassword())
        );

        UserRepo.save(employee);

        return employee.getName();
    }
    DTO U;

    @Override
    public LoginMessage  loginEmployee(LoginDto loginDTO) {
        UserEntity employee1 = UserRepo.findByEmail(loginDTO.getEmail());
        if (employee1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = employee1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<UserEntity> employee = UserRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginMessage("Login Success",true);
                } else {
                    return new LoginMessage("Login Failed", false);
                }
            } else {

                return new LoginMessage("password Not Match", false);
            }
        }else {
            return new LoginMessage("Email not exits", false);
        }


    }

}