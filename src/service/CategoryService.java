package service;

import model.Category;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 11/20/2021
 * Time: 8:10 PM
 */
public interface CategoryService {

    boolean addCategory(Category category);

    boolean editCategory(Category category);

    boolean deleteCategory(Long id);

}
