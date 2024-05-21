package evaluation;

public class SessionManager {
    private static SessionManager instance;
    private boolean isLoggedIn;

    private SessionManager() {
        isLoggedIn = false;
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public void logout() {
        isLoggedIn = false;
    }
}
