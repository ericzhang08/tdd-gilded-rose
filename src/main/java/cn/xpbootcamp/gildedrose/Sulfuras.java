package cn.xpbootcamp.gildedrose;

public class Sulfuras extends Product {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras", sellIn, quality);
    }

    @Override
    public void updateQualityUnexpired() {

    }
    @Override
    public void updateQualityExpired() {
    }
}
