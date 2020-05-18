package cn.xpbootcamp.gildedrose;

public class Sulfuras {
    private  int sellIn;
    private  int quality;

    public Sulfuras(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void oneDayPass() {
        sellIn--;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
