package App.Controllers.Request;

/**
 * @author Arbaces Restrepo, Yhogan Viancha, Kevin Parra
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRequest {
    private String document;
    private String userName;
    private String password;
    private String oldPassword;
    private String role;
}