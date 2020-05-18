package cn.xpbootcamp.gildedrose;

public class BackstagePass {
    private  int sellIn;
    private  int quality;

    public BackstagePass(int sellIn, int quality) {
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
