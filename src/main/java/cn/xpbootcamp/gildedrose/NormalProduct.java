package cn.xpbootcamp.gildedrose;

public class NormalProduct {
    private  int sellIn;
    private  int quality;

    public NormalProduct(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void oneDayPass() {
        if(sellIn <= 0){
            quality--;
        }
        quality--;
        this.sellIn--;

    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
