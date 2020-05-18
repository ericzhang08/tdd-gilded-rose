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
}
