package urban.pass.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import urban.pass.app.model.Users;

public interface UsersRepository extends MongoRepository<Users, Integer> {
}
