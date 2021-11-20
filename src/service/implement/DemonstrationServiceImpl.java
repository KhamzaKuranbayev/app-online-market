package service.implement;

import model.Category;
import model.Product;
import realization.OnlineMarketDemo;
import service.CategoryService;
import service.DemonstrationService;
import service.ProductService;

import java.util.List;
import java.util.Scanner;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 11/20/2021
 * Time: 8:01 PM
 */
public class DemonstrationServiceImpl implements DemonstrationService {

    static Scanner scanner;
    static CategoryService categoryService;
    static ProductService productService;

    @Override
    public void showCustomerMenu() {
        scanner = new Scanner(System.in);
        List<Category> categories = OnlineMarketDemo.categories;

        System.out.println("============ CUSTOMER FORM ==============");
        System.out.println("PlEASE CHOOSE CATEGORY:");
        for (Category category : categories) {
            System.out.println(category.getId() + ". " + category.getName());
        }
        System.out.println("+ Choose All   - Cancel   v - View Shopping Cart   o - My Orders");
        System.out.println("=========================================");
        System.out.println("Choose:");
        int choice = scanner.nextInt();
    }

    @Override
    public void showSalesmanMenu() {
        scanner = new Scanner(System.in);

        System.out.println("1. Add Product");
        int choice = scanner.nextInt();

        /**
         *
         *      private Long id;
         *     private String name;
         *     private Category category;
         *     private Category subCategory;
         *     private Double price;
         *
         */

        switch (choice) {
            case 1:
                System.out.println("Name: ");
                String name = scanner.nextLine();

                /*Product product = new Product(

                )*/

                //productService.addProduct()
        }


    }

    @Override
    public void showManagerMenu() {

    }

    @Override
    public void showDirectorMenu() {

    }
}
