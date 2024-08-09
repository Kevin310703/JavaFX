package com.c2306l.javafxe3.Service;

import com.c2306l.javafxe3.Global.AppProperties;
import com.c2306l.javafxe3.Model.MySQLConnection;
import com.c2306l.javafxe3.Model.Users;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.util.Base64;

public class AuthenticationService {
    public static boolean login(String username, String password) {
        com.c2306l.javafxe3.Entity.Users user = Users.findByUserName(username);
        if(user.getPassword().equals(password)) {
            AppProperties.setProperty("user.token",getToken());
            //update token to Users
            return true;
        }
        return false;
    }
    private static String getToken(){
        String alphabet ="abcdefghijklmnopqrstuvwxyz0123456789";
        String token = "";
        for(int i=0;i<6;i++){
            int index = (int) (Math.random()*alphabet.length());
            token += alphabet.charAt(index);
        }
        return Base64.getEncoder().encodeToString(token.getBytes());
    }
//    private String hashMD5(String pwd) {
//        try {
//            MessageDigest digest = MessageDigest.getInstance("MD5");
//            byte[] hash = digest.digest(pwd.getBytes());
//            BigInteger hashSigma =new BigInteger(1,hash);
//            String hashString = hashSigma.toString(16);
//            String haslSalt = AppProperties.getProperty("hash.salt");
//            return hashString+haslSalt;
//        }catch(NoSuchAlgorithmException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }
}
