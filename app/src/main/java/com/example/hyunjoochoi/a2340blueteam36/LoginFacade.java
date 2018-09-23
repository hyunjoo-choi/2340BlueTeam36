package com.example.hyunjoochoi.a2340blueteam36;

public class LoginFacade {
    private static LoginFacade INSTANCE = new LoginFacade();
    private User currentUser = null;
    private UserValid _userValid;

    /**
     * Call this instead of the constructor.
     * @return instance of the facade
     */
    public static LoginFacade getInstance() {
        return INSTANCE;
    }

    /**
     *   Private constructor for facade
     */
    private LoginFacade() {
        _userValid = new UserValid();
    }

    /**
     * Getting the current user logged in.
     *
     * @return  the last logged in user
     */
    public User getCurrentUser() {return currentUser; }
    public boolean doLogin(String username, String password) {
        if (currentUser != null)
            return false;
        User user = _userValid.attemptLogin(username, password);
        if (user != null) {
            currentUser = user;
            return true;
        }
        return false;
    }
}
