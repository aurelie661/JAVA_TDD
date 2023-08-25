import org.example.entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {
    Product product;
    @BeforeEach
    public void setUp(){
        product = new Product();
    }

    @Test
    public void testProductOnceTheExpirationDateIsZeroQualityShouldBeDegradesTwiceAsFast(){
        int result = product.updateProduct(0,10);
        Assertions.assertEquals(0,9);
    }
}
