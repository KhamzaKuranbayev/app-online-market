package service;

import model.Product;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 11/20/2021
 * Time: 8:18 PM
 */
public interface ProductService {

    boolean addProduct(Product product);

    boolean editProduct(Product product);

    boolean deleteProduct(Long id);

}
