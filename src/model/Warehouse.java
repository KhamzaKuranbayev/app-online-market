package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 11/20/2021
 * Time: 6:41 PM
 */
public class Warehouse {

    private Long id;
    private String name;
    private Integer number;
    private Map<Product, Integer> products;

    public Warehouse() {
    }

    public Warehouse(Long id, String name, Integer number, Map<Product, Integer> products) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", products=" + products +
                '}';
    }

    /* public static void main(String[] args) {
        Warehouse ombor = new Warehouse();
        ombor.setId(1L);
        ombor.setName("Wh TR123");
        ombor.setNumber(1234);


        Map<Product, Integer> map = new HashMap<>();
        map.put(
                new Product(
                        1L,
                        "Samsung S3",
                        new Category(5L, "Electronics", "Electronics desc"),
                        new Category(1L, "Phone", "Phone desc"),
                        500.0), 60);

        map.put(
                new Product(
                        1L,
                        "Samsung S3",
                        new Category(5L, "Electronics", "Electronics desc"),
                        new Category(1L, "Phone", "Phone desc"),
                        500.0), 60);

        map.put(
                new Product(
                        1L,
                        "Samsung S3",
                        new Category(5L, "Electronics", "Electronics desc"),
                        new Category(1L, "Phone", "Phone desc"),
                        500.0), 60);

        map.put(
                new Product(
                        1L,
                        "Samsung S3",
                        new Category(5L, "Electronics", "Electronics desc"),
                        new Category(1L, "Phone", "Phone desc"),
                        500.0), 60);



        ombor.setProducts(map);

    }
    */


}
