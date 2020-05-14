package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String SULFURAS = "Sulfuras";

    @Test
    public void should_quality_decrease_1_point_per_day_when_one_day_passed_given_on_date_normal_product() {
        int sellIn = 2;
        int quality = 5;
        Product product = Product.create("normal", sellIn, quality);
        product.passDays(1);
        assertEquals(4, product.getQuality());
    }

    @Test
    public void should_quality_decrease_2_point_per_day_when_one_day_passed_given_an_out_of_date_normal_product() {
        int sellIn = 0;
        int quality = 5;
        Product product = Product.create("normal", sellIn, quality);
        product.passDays(1);
        assertEquals(3, product.getQuality());
    }

    @Test
    public void should_quality_decrease_1_point_per_day_when_multiple_day_passed_given_on_date_normal_product() {
        int sellIn = 10;
        int quality = 10;
        Product product = Product.create("normal", sellIn, quality);
        product.passDays(5);
        assertEquals(5, product.getQuality());
    }

    @Test
    public void should_quality_decrease_2_point_per_day_when_multiple_day_passed_given_an_out_of_date_normal_product() {
        int sellIn = 0;
        int quality = 10;
        Product product = Product.create("normal", sellIn, quality);
        product.passDays(5);
        assertEquals(0, product.getQuality());
    }

    @Test
    public void should_quality_decrease_when_multiple_day_passed_given_an_on_date_product_become_an_out_of_date_normal_product() {
        int sellIn = 5;
        int quality = 20;
        Product product = Product.create("normal", sellIn, quality);
        product.passDays(10);
        assertEquals(5, product.getQuality());
    }

    @Test
    public void should_quality_is_bigger_than_0_when_multiple_day_passed_given_and_product_quality_bigger_than_0() {
        int sellIn = 5;
        int quality = 5;
        Product product = Product.create("normal", sellIn, quality);
        product.passDays(10);
        assertEquals(0, product.getQuality());
    }


    @Test
    public void should_quality_is_49_when_one_day_passed_given_an_product_quality_bigger_than_50() {
        int sellIn = 5;
        int quality = 100;
        Product product = Product.create("normal", sellIn, quality);
        product.passDays(1);
        assertEquals(49, product.getQuality());
    }

    @Test
    public void should_quality_increase_one_point_per_day_when_multiple_day_passed_given_aged_brie_product_is_on_date() {
        int sellIn = 10;
        int quality = 10;
        Product product = Product.create("Aged Brie", sellIn, quality);
        product.passDays(5);
        assertEquals(15, product.getQuality());
    }


    @Test
    public void should_quality_increase_two_point_per_day_when_multiple_day_passed_given_aged_brie_product_is_out_of_date() {
        int sellIn = 0;
        int quality = 10;
        Product product = Product.create("Aged Brie", sellIn, quality);
        product.passDays(5);
        assertEquals(20, product.getQuality());
    }

    @Test
    public void should_biggest_quality_is_50__when_multiple_day_passed_given_aged_brie_product_quality_is_smaller_than_50_and_increase_to_50() {
        int sellIn = 0;
        int quality = 40;
        Product product = Product.create(AGED_BRIE, sellIn, quality);
        product.passDays(10);
        assertEquals(50, product.getQuality());
    }

    @Test
    public void should_quality_increase_when_multiple_day_passed_given_an_on_date_product_become_an_out_of_date_aged_brie_product() {
        int sellIn = 5;
        int quality = 20;
        Product product = Product.create(AGED_BRIE, sellIn, quality);
        product.passDays(10);
        assertEquals(35, product.getQuality());
    }

    @Test
    public void should_quality_does_not_change_when_multiple_days_passed_given_an_on_date_sulfuras_product() {
        int sellIn = 10;
        int quality = 20;
        Product product = Product.create(SULFURAS, sellIn, quality);
        product.passDays(5);
        assertEquals(20, product.getQuality());
    }

    @Test
    public void should_quality_does_not_change_when_multiple_day_passed_given_an_on_date_product_become_an_out_of_date_sulfuras_product() {
        int sellIn = 5;
        int quality = 20;
        Product product = Product.create(SULFURAS, sellIn, quality);
        product.passDays(10);
        assertEquals(20, product.getQuality());
    }


    @Test
    public void should_quality_increase_1_per_day_when_multiple_days_passed_given_an_on_date_over_10_days_Backstage_pass_product() {
        int sellIn = 15;
        int quality = 20;
        Product product = Product.create("Backstage pass", sellIn, quality);
        product.passDays(3);
        assertEquals(23, product.getQuality());
    }



}
