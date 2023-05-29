package com.doubleDimple.userServer.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;

@Component
public class JwtUtils {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private int expiration;

    // 生成JWT
    public  String generateToken(Integer userId, String username, String phoneNumber) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + expiration * 1000);

        return Jwts.builder()
                .claim("userId", userId)
                .claim("username", username)
                .claim("phoneNumber", phoneNumber)
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    // 验证JWT
    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            // 验证失败
        }
        return false;
    }

    public String renewToken(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(secret)
                .build()
                .parseClaimsJws(token)
                .getBody();

        Integer userId = claims.get("userId", Integer.class);
        String username = claims.get("username", String.class);
        String phoneNumber = claims.get("phoneNumber", String.class);

        return generateToken(userId, username, phoneNumber);
    }

    // 从JWT中获取用户ID
    public Integer getUserIdFromToken(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();

        return claims.get("userId", Integer.class);
    }

    // 从JWT中获取用户名
    public String getUsernameFromToken(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();

        return claims.get("username", String.class);
    }

    // 从JWT中获取手机号码
    public String getPhoneNumberFromToken(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();

        return claims.get("phoneNumber", String.class);
    }

    public static void main(String[] args) {
        System.out.println(generateRandomKey());
    }

    public static String generateRandomKey() {
        // 生成适用于 HS512 的安全密钥
        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);

        // 将密钥转换为 Base64 编码的字符串形式
        String base64EncodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());

        return base64EncodedKey;
    }
}

