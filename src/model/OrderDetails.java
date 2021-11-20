package model;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 11/20/2021
 * Time: 7:08 PM
 */
public class OrderDetails {

    private Long id;
    private Order order;
    private Product product;
    private Integer productQty;
    private Double price;

    public OrderDetails(Long id, Order order, Product product, Integer productQty, Double price) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.productQty = productQty;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getProductQty() {
        return productQty;
    }

    public void setProductQty(Integer productQty) {
        this.productQty = productQty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", order=" + order +
                ", product=" + product +
                ", productQty=" + productQty +
                ", price=" + price +
                '}';
    }

    /*

    Order
    Order 1   Narxi: 190 000;

    OrderDetails:
    1.   Order 1   Samsung S3     5   25 000
    2.   Order 1   Redmi Note 3   2   75 000
    3.   Order 1   Shim           2   10 000
    4.   Order 1   Dazmol         1   80 000
     */


}
