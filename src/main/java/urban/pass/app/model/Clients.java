package urban.pass.app.model;
import lombok.Getter;
import org.apache.catalina.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Getter
@Document(collection = "Client")
public class Clients {
    @Id
    private String id;
    @DBRef
    private Users user;

    public Clients(Users user){
        this.user = user;
    }
}