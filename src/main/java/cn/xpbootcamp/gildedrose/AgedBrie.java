package cn.xpbootcamp.gildedrose;

public class AgedBrie extends Product {
    public AgedBrie( int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQualityUnexpired() {
        this.quality++;
    }

    @Override
    public void updateQualityExpired() {
        quality += 2;
        quality = Math.min(quality, 50);
    }
}
