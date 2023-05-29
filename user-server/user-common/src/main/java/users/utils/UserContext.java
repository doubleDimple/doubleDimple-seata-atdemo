package users.utils;

import users.entity.pojo.Users;

public class UserContext {
    private static ThreadLocal<Users> userThreadLocal = new ThreadLocal<>();

    public static void setUser(Users user) {
        userThreadLocal.set(user);
    }

    public static Users getUser() {
        return userThreadLocal.get();
    }

    public static void clear() {
        userThreadLocal.remove();
    }
}

