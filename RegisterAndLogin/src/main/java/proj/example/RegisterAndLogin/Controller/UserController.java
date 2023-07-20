

package proj.example.RegisterAndLogin.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import proj.example.RegisterAndLogin.DTO;
import proj.example.RegisterAndLogin.LoginDto;
import proj.example.RegisterAndLogin.LoginMessage;
import proj.example.RegisterAndLogin.service.UserService;
@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService UserService;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody DTO userDTO)
    {
        String id = UserService.addEmployee(userDTO);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDto loginDTO)
    {
        LoginMessage loginResponse = UserService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}