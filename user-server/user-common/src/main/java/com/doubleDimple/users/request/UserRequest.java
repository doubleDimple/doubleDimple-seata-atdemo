package com.doubleDimple.users.request;

import lombok.Data;
import com.doubleDimple.users.entity.pojo.Users;

@Data
public class UserRequest extends Users {

    private String password;
}
