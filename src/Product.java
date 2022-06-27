public class Product {
    //Product( name : 'CPU', price: 750, quality: 10, categoryId: 1)
    private String name;
    private double price, quality;
    private int categoryId;

    public Product(){}

    public Product(String name, double price, double quality, int categoryId) {
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
