package users.request;

import lombok.Data;
import users.entity.pojo.Users;

@Data
public class UserRequest extends Users {

    private String password;
}
