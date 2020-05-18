package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {

    @Test
    public void should_sellIn_1_and_quality_50_when_one_day_pass_given_sulfuras_sellIn_2_quality_50() {
        Sulfuras sulfuras = new Sulfuras(2, 50);
        sulfuras.oneDayPass();
        assertEquals(sulfuras.getSellIn(), 1);
        assertEquals(sulfuras.getQuality(), 50);
    }
}
