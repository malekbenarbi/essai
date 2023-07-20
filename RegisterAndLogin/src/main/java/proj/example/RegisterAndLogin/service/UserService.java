package proj.example.RegisterAndLogin.service;

import proj.example.RegisterAndLogin.DTO;
import proj.example.RegisterAndLogin.LoginDto;
import proj.example.RegisterAndLogin.LoginMessage;

public interface UserService{
    String addEmployee(DTO employeeDTO);
    LoginMessage loginEmployee(LoginDto loginDTO);
}


