package com.example.hyunjoochoi.a2340blueteam36;

import com.example.hyunjoochoi.a2340blueteam36.User;

import java.util.HashMap;

/**
 * Map contains all valid users.
 * Can create a new user or check validity to log in.
 * @author hyunjoochoi
 * @version 1.0
 */
public class UserValid {
    private HashMap<String, User> allusers;

    /**
     * Creates a new user to store into HashMap
     * @param id new user's username
     * @param pw new user's password
     * @param name new user's actual name
     */
    public void createUser(String id, String pw, String name) {
        User user = new User(id, pw, name);
        allusers.put(id, user);
    }

    /**
     * Checks if user exists by id. If user exists, checks password as well.
     * @param id user's input username
     * @param pw user's input password
     * @return user that corresponds to correct user in HashMap, or null if not found.
     */
    public User attemptLogin(String id, String pw) {
        User tempUser;
        if (allusers.containsKey(id)) {
            tempUser = allusers.get(id);
            if (allusers.get(id).validPW(pw)) {
                return tempUser;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    public UserValid() {
        allusers = new HashMap<>();
        createUser("user", "pass", "First Last");
    }
}
