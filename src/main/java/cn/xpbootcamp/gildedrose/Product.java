package cn.xpbootcamp.gildedrose;

public class Product {
    private int sellIn;
    private int quality;

    public Product(int sellIn, int quality) {

        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void passDays(int days) {
        if (sellIn <= 0) {
            sellIn--;
            quality -= 2 * days;
        } else {
            sellIn--;
            quality -= days;
        }

    }

    public Object getQuality() {
        return quality;
    }
}
