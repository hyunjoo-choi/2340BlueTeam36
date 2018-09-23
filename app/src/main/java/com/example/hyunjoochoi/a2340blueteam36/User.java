package com.example.hyunjoochoi.a2340blueteam36;

/**
 * User class that has user information.
 *
 * @author hyunjoochoi
 * @version 1.0
 */
public class User {
    private String username;
    private String password;
    private String name;

    /**
     * Creates a new user.
     *
     * @param username the input username for user's id
     * @param password the input password for user's password
     * @param name the actual name of user
     */
    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    /**
     * Checks if the password param matches the user's password
     * @param pw user's password
     * @return boolean on whether password is valid or not
     */
    public boolean validPW(String pw) {
        return password.equals(pw);
    }

}
