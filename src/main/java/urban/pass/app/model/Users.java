package urban.pass.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Users")
public class Users {
    @Id
    private int id;
    private String username;
    private String email;
    private String password;
    private String profile_picture;
}
