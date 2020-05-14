package cn.xpbootcamp.gildedrose;

public class BackstagePass extends Product {

    public BackstagePass( int sellIn, int quality) {
        super("Backstage pass", sellIn, quality);
    }

    @Override
    public void updateQualityUnexpired() {
        quality++;
        if(sellIn <= 10){
            quality++;
        }
    }

    @Override
    public void updateQualityExpired() {
        super.updateQualityExpired();
    }
}
