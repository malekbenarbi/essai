package proj.example.RegisterAndLogin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;
@EnableJpaRepositories

public interface UserRepo extends JpaRepository<UserEntity,Integer> {
	

Optional<UserEntity> findOneByEmailAndPassword(String email, String password);
UserEntity findByEmail(String email);
}
