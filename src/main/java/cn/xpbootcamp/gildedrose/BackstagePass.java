package cn.xpbootcamp.gildedrose;

public class BackstagePass extends Product {

    public BackstagePass( int sellIn, int quality) {
        super("Backstage pass", sellIn, quality);
    }

    @Override
    public void updateQualityUnexpired() {
        quality++;
        if(sellIn <= 10 ){
            quality++;
        }
        if(sellIn <= 5 ){
            quality++;
        }
    }

    @Override
    public void updateQualityExpired() {
            quality = 0;
    }
}
