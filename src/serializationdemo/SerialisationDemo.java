package serializationdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialisationDemo {
    public static void main(String[] args) {
        User ghislain = new User("admin", "admin");
        
        try (FileOutputStream fos = new FileOutputStream("user.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(ghislain);
            System.out.println(ghislain + " sÚrialisÚ dans 'user.ser'.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
