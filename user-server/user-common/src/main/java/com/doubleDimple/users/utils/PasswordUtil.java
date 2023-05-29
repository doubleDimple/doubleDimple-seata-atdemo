package com.doubleDimple.users.utils;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class PasswordUtil {

    // 生成随机盐值
    public static String generateSalt() {
        return BCrypt.gensalt();
    }

    // 加密密码
    public static String encryptPassword(String password, String salt) {
        return BCrypt.hashpw(password, salt);
    }

    // 验证密码
    public static boolean verifyPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }


    public static void main(String[] args) {
        String rawPassword = "123456"; // 从用户输入中获取原始密码

        // 生成随机盐值
        String salt = PasswordUtil.generateSalt();

        // 加密密码
        String hashedPassword = PasswordUtil.encryptPassword(rawPassword, salt);

        // 模拟将加密后的密码哈希值存储在用户表中
        // 这里假设将 hashedPassword 存储到数据库中的密码字段

        String loginPassword = "123456"; // 从用户输入中获取登录密码

        // 从数据库中获取存储的密码哈希值（这里假设从数据库中读取）
        String storedHashedPassword = hashedPassword; // 假设从数据库中获取存储的密码哈希值

        // 验证密码
        boolean passwordMatch = PasswordUtil.verifyPassword(loginPassword, storedHashedPassword);

        if (passwordMatch) {
            System.out.println("密码匹配，登录成功");
        } else {
            System.out.println("密码不匹配，登录失败");
        }
    }


}
