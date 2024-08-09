package com.c2306l.javafxe3.Entity;

public class Users {
    private int id;
    private String username;
    private String password;
    private String tokenKey;
    public Users(){;}
    public Users(int id, String username, String password, String tokenKey) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tokenKey = tokenKey;
    }
    public String getTokenKey() {
        return tokenKey;
    }

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
