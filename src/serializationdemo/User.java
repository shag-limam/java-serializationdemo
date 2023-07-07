package serializationdemo;

import java.io.Serializable;

import java.io.Serializable;

public class User implements Serializable {
		private String login ;
		private String password ;
		private int identifiant ;
		
	public User (int identifiant, String login, String password) {
		this (login, password);
		this.identifiant = identifiant;
	}

	public User (String login, String password) {
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

