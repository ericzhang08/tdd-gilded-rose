package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalProductTest {
    @Test
    public void should_sellIn_4_and_quality_9_when_one_day_pass_given_normal_product_sellIn_5_quality_10() {
        NormalProduct normalProduct = new NormalProduct(5, 10);
        normalProduct.oneDayPass();
        assertEquals(normalProduct.getSellIn(), 4);
        assertEquals(normalProduct.getQuality(), 9);
    }


}
