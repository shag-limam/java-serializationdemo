package User.java;

import java.io.Serializable;

public class User implements Serializable {
    private String login;
    private String password;
    private int identifiant;
    
    public User(int identifiant, String login, String password) {
        this(identifiant, login);
        this.password = password;
    }
    
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    
    public String getLogin() {
        return login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public int getIdentifiant() {
        return identifiant;
    }
}
