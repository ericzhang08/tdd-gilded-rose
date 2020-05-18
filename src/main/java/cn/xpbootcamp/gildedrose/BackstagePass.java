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
        if(sellIn <=10 && sellIn >0){
            quality++;
        }
        if (sellIn <= 5 && sellIn > 0) {
            quality++;
        }
        sellIn--;
        if (sellIn < 0) {
            quality =0;
        }
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
