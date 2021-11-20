package model;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 11/20/2021
 * Time: 7:15 PM
 */
public class ShoppingCart {

    private Long id;
    private Product product;
    private Integer qty;

    public ShoppingCart(Long id, Product product, Integer qty) {
        this.id = id;
        this.product = product;
        this.qty = qty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", product=" + product +
                ", qty=" + qty +
                '}';
    }
}
