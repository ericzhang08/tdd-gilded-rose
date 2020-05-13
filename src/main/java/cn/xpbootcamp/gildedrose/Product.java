package cn.xpbootcamp.gildedrose;

public class Product {
    private int sellIn;
    private int quality;
    private String type;

    public Product(String type, int sellIn, int quality) {
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
        if (isExpired()) {
            updateQualityExpired();
        } else {
            updateQualityUnexpired();
        }
        if (quality < 0) {
            quality = 0;
        }
    }

    private void updateQualityUnexpired() {
        if (type == "Aged Brie") {
            quality++;
        } else {
            quality--;
        }
    }

    private void updateQualityExpired() {
        quality -= 2;
    }

    private boolean isExpired() {
        return sellIn <= 0;
    }

    public Object getQuality() {
        return quality;
    }
}
