package realization;

import model.*;
import service.CategoryService;
import service.DemonstrationService;
import service.RegistrationService;
import service.implement.DemonstrationServiceImpl;
import service.implement.RegistrationServiceIml;

import java.util.*;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 11/20/2021
 * Time: 7:19 PM
 */
public class OnlineMarketDemo {
    public static Scanner scanner = new Scanner(System.in);

    public static Set<User> users = new HashSet<>();                        // DONE
    public static List<Category> categories = new ArrayList<>();
    public static Map<Integer, Product> products = new HashMap<>();

    /**
     * orders, orderDetails, shoppingCarts - larga RUNTIME da load bo'ladi
     */
    public static List<Order> orders = new ArrayList<>();
    public static List<OrderDetails> orderDetails = new ArrayList<>();
    public static List<ShoppingCart> shoppingCarts = new ArrayList<>();

    public static Map<Product, Integer> tempMap = new LinkedHashMap<>();

    static RegistrationService registrationService;
    static DemonstrationService demonstrationService;
    static CategoryService categoryService;

    public static User currentUser;

    public static void main(String[] args) {


        int choice;
        do {
            showMainMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    signIn();
                    break;
                case 2:
                    signUp();
                    break;
                default:
                    System.out.println("Incorrect option!");
            }

        } while (choice != 0);
    }

    private static void signUp() {
        registrationService = new RegistrationServiceIml();
        boolean isSuccess = registrationService.signUp();
        if (isSuccess)
            // TODO: 11/20/2021 will write logic here
            System.out.println("Success!");
        else
            System.out.println("Something went wrong!");
    }

    private static void signIn() {
        registrationService = new RegistrationServiceIml();
        boolean isSuccess = registrationService.signIn();
        if (isSuccess) {
            demonstrationService = new DemonstrationServiceImpl();

            switch (currentUser.getRole()) {
                case CUSTOMER:
                    demonstrationService.showCustomerMenu();
                    break;

                case SALESMAN:
                    demonstrationService.showSalesmanMenu();
                    break;

                case MANAGER:
                    demonstrationService.showManagerMenu();
                    break;

                case DIRECTOR:
                    demonstrationService.showDirectorMenu();
                    break;
            }
        } else {
            System.out.println("User not found!");
        }
    }

    private static void showMainMenu() {
        System.out.println("Menu");
        System.out.println("1. Sign In");
        System.out.println("2. Sign Up");
        System.out.println("0. Exit");
    }


}
