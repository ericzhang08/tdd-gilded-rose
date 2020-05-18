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

    @Test
    public void should_sellIn_0_and_quality_49_when_one_day_pass_given_sulfuras_sellIn_1_quality_49() {
        Sulfuras sulfuras = new Sulfuras(1, 49);
        sulfuras.oneDayPass();
        assertEquals(sulfuras.getSellIn(), 0);
        assertEquals(sulfuras.getQuality(), 49);
    }

    @Test
    public void should_sellIn_n1_and_quality_49_when_one_day_pass_given_sulfuras_sellIn_0_quality_49() {
        Sulfuras sulfuras = new Sulfuras(0, 49);
        sulfuras.oneDayPass();
        assertEquals(sulfuras.getSellIn(), -1);
        assertEquals(sulfuras.getQuality(), 49);
    }


}
