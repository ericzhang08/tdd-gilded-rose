package cn.xpbootcamp.gildedrose;

public class Product {
    private int sellIn;
    private int quality;
    private String type;

    public Product(String type, int sellIn, int quality) {
        this.type = type;
        if (quality > 50) {
            quality = 50;
        }
        this.type = type;
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
            if (type == "Aged Brie") {
                quality++;
            } else {
                quality--;
            }
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
