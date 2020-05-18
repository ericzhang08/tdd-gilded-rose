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

    @Test
    public void should_sellIn_0_and_quality_9_when_one_day_pass_given_normal_product_sellIn_1_quality_10() {
        NormalProduct normalProduct = new NormalProduct(1, 10);
        normalProduct.oneDayPass();
        assertEquals(normalProduct.getSellIn(), 0);
        assertEquals(normalProduct.getQuality(), 9);
    }

    @Test
    public void should_sellIn_n1_and_quality_8_when_one_day_pass_given_normal_product_sellIn_0_quality_10() {
        NormalProduct normalProduct = new NormalProduct(0, 10);
        normalProduct.oneDayPass();
        assertEquals(normalProduct.getSellIn(), -1);
        assertEquals(normalProduct.getQuality(), 8);
    }

    @Test
    public void should_sellIn_n2_and_quality_8_when_one_day_pass_given_normal_product_sellIn_n1_quality_10() {
        NormalProduct normalProduct = new NormalProduct(-1, 10);
        normalProduct.oneDayPass();
        assertEquals(normalProduct.getSellIn(), -2);
        assertEquals(normalProduct.getQuality(), 8);
    }

    @Test
    public void should_sellIn_2_and_quality_0_when_one_day_pass_given_normal_product_sellIn_3_quality_0() {
        NormalProduct normalProduct = new NormalProduct(3, 0);
        normalProduct.oneDayPass();
        assertEquals(normalProduct.getSellIn(), 2);
        assertEquals(normalProduct.getQuality(), 0);
    }

}
