package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
   public void should_quality_decrease_1_point_per_day_when_one_day_passed_given_on_date_product() {
        int sellIn =2;
        int quality = 5;
        Product product = new Product(sellIn, quality);
        product.passDay();
        assertEquals(product.getQuality(), 4);
    }

    @Test
    public void should_quality_decrease_2_point_per_day_when_one_day_passed_given_an_out_of_date_product() {
        int sellIn = 0;
        int quality = 5;
        Product product = new Product(sellIn, quality);
        product.passDay();
        assertEquals(product.getQuality(), 3);
    }

}
