/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hihi.techmaster;

import Model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 */
public class Techmaster {
    public static List<User> users;
    public static User user;

    static {
        users = new ArrayList<>();
        users.add(new User("tien", "123", "tien@gmail.com"));
        users.add(new User("hihi", "123", "hihi@gmail.com"));
        users.add(new User("linh", "123", "linh@gmail.com"));
        users.add(new User("hung", "123", "hung@gmail.com"));

        
 
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
