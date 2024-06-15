package urban.pass.app.model;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Getter
@Document(collection = "Collaborator")
public class Collaborators {
    @Id
    private String id;
    @DBRef
    private Users user;

    public Collaborators(Users user){
        this.user = user;
    }
}