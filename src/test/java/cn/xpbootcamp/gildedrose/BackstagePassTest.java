package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassTest {
    @Test
    public void should_sellIn_10_and_quality_11_when_one_day_pass_given_back_stage_pass_sellIn_11_quality_10() {
        BackstagePass backstagePass = new BackstagePass(11, 10);
        backstagePass.oneDayPass();
        assertEquals(backstagePass.getSellIn(), 10);
        assertEquals(backstagePass.getQuality(), 11);
    }

    @Test
    public void should_sellIn_9_and_quality_12_when_one_day_pass_given_back_stage_pass_sellIn_10_quality_10() {
        BackstagePass backstagePass = new BackstagePass(10, 10);
        backstagePass.oneDayPass();
        assertEquals(backstagePass.getSellIn(), 9);
        assertEquals(backstagePass.getQuality(), 12);
    }

    @Test
    public void should_sellIn_4_and_quality_13_when_one_day_pass_given_back_stage_pass_sellIn_5_quality_10() {
        BackstagePass backstagePass = new BackstagePass(5, 10);
        backstagePass.oneDayPass();
        assertEquals(backstagePass.getSellIn(), 4);
        assertEquals(backstagePass.getQuality(), 13);
    }

    @Test
    public void should_sellIn_n1_and_quality_0_when_one_day_pass_given_back_stage_pass_sellIn_0_quality_10() {
        BackstagePass backstagePass = new BackstagePass(0, 10);
        backstagePass.oneDayPass();
        assertEquals(backstagePass.getSellIn(), -1);
        assertEquals(backstagePass.getQuality(), 0);
    }


    @Test
    public void should_sellIn_4_and_quality_50_when_one_day_pass_given_back_stage_pass_sellIn_5_quality_49() {
        BackstagePass backstagePass = new BackstagePass(5, 49);
        backstagePass.oneDayPass();
        assertEquals(backstagePass.getSellIn(), 4);
        assertEquals(backstagePass.getQuality(), 50);
    }

    @Test
    public void should_sellIn_n2_and_quality_0_when_one_day_pass_given_back_stage_pass_sellIn_n1_quality_0() {
        BackstagePass backstagePass = new BackstagePass(-1, 0);
        backstagePass.oneDayPass();
        assertEquals(backstagePass.getSellIn(), -2);
        assertEquals(backstagePass.getQuality(), 0);
    }

}