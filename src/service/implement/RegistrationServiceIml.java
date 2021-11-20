package service.implement;

import enums.Role;
import model.User;
import realization.OnlineMarketDemo;
import service.RegistrationService;

import java.util.Scanner;
import java.util.Set;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 11/20/2021
 * Time: 7:16 PM
 */
public class RegistrationServiceIml implements RegistrationService {

    public static Scanner scanner;

    @Override
    public boolean signUp() {
        scanner = new Scanner(System.in);
        System.out.println("Fullname: ");
        String fullname = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();

        System.out.println("Choose the role:");
        int indexOfRole = 1;
        for (Role value : Role.values()) {
            System.out.println(indexOfRole + " " + value);
            indexOfRole++;
        }
        int roleIndex = scanner.nextInt();
        Role role = Role.values()[roleIndex - 1];

        Set<User> users = OnlineMarketDemo.users;
        int lastId = users.size() + 1;
        User newUser =
                new User(
                        Long.valueOf(lastId),
                        fullname,
                        email,
                        password,
                        role);

        OnlineMarketDemo.users.add(newUser);
        return true;
    }

    @Override
    public boolean signIn() {
        scanner = new Scanner(System.in);
        System.out.println("Email: ");
        String email = scanner.next();
        System.out.println("Password: ");
        String password = scanner.next();

        for (User user : OnlineMarketDemo.users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                OnlineMarketDemo.currentUser = user;
                return true;
            }
        }
        return false;
    }
}
