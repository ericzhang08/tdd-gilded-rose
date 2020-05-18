package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {
    @Test
    public void should_sellIn_4_and_quality_11_when_one_day_pass_given_Aged_Brie_sellIn_5_quality_10() {
        AgedBrie agedBrie = new AgedBrie(5, 10);
        agedBrie.oneDayPass();
        assertEquals(agedBrie.getSellIn(), 4);
        assertEquals(agedBrie.getQuality(), 11);
    }

    @Test
    public void should_sellIn_0_and_quality_1_when_one_day_pass_given_Aged_Brie_sellIn_1_quality_0() {
        AgedBrie agedBrie = new AgedBrie(1, 0);
        agedBrie.oneDayPass();
        assertEquals(agedBrie.getSellIn(), 0);
        assertEquals(agedBrie.getQuality(), 1);
    }

    @Test
    public void should_sellIn_n1_and_quality_2_when_one_day_pass_given_Aged_Brie_sellIn_0_quality_0() {
        AgedBrie agedBrie = new AgedBrie(0, 0);
        agedBrie.oneDayPass();
        assertEquals(agedBrie.getSellIn(), -1);
        assertEquals(agedBrie.getQuality(), 2);
    }

    @Test
    public void should_sellIn_n3_and_quality_4_when_one_day_pass_given_Aged_Brie_sellIn_n2_quality_2() {
        AgedBrie agedBrie = new AgedBrie(-2, 2);
        agedBrie.oneDayPass();
        assertEquals(agedBrie.getSellIn(), -3);
        assertEquals(agedBrie.getQuality(), 4);
    }

    @Test
    public void should_sellIn_0_and_quality_50_when_one_day_pass_given_Aged_Brie_sellIn_1_quality_49() {
        AgedBrie agedBrie = new AgedBrie(1, 49);
        agedBrie.oneDayPass();
        assertEquals(agedBrie.getSellIn(), 0);
        assertEquals(agedBrie.getQuality(), 50);
    }


}
