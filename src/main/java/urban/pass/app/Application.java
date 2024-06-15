package urban.pass.app;

import urban.pass.app.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import urban.pass.app.dao.UsersRepository;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/user")
public class Application {

	@Autowired
	private UsersRepository usersRepository;

	@PostMapping
	private Users saveUser(@RequestBody Users users) {
		return usersRepository.save(users);
	}

	@GetMapping
	public List<Users> getUsers() {
		return usersRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
