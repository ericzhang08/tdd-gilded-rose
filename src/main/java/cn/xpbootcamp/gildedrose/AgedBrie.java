package cn.xpbootcamp.gildedrose;

public class AgedBrie {
    private  int sellIn;
    private  int quality;

    public AgedBrie(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void oneDayPass() {
        quality++;
        sellIn--;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
