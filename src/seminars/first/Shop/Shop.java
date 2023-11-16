package seminars.first.Shop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }



    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public void sortProductsByPrice(List<Product> products) {
        // Допишите реализацию метода самостоятельно
        Arrays.sort(new List[]{products});

    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        return null;
    }

}