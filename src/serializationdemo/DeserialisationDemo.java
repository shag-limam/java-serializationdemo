package serializationdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialisationDemo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("user.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            User user = (User) ois.readObject();
            System.out.println(user + " d�s�rialis� avec succ�s ...");
            System.out.println("Login : " + user.getLogin());
            System.out.println("Password : " + user.getPassword());
            System.out.println("Identifiant : " + user.getIdentifiant());
        } catch (IOException ioe) {
            System.out.println("An error occurred: " + ioe.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("User class not found: " + e.getMessage());
        }
    }
}
