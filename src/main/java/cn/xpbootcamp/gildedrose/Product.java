package cn.xpbootcamp.gildedrose;

public class Product {
    private int sellIn;
    private int quality;

    public Product(int sellIn, int quality) {

        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void passDays(int days) {
        for (int i = 0; i < days; i++) {
            processQualityPerDay();
            sellIn--;
        }
    }

    private void processQualityPerDay() {
        if (sellIn > 0) {
            quality--;
        } else {
            quality -= 2;
        }
        if (quality < 0) {
            quality = 0;
        }
    }

    public Object getQuality() {
        return quality;
    }
}
