package cn.xpbootcamp.gildedrose;

public class Product {
    int sellIn;
    int quality;
    String type;

    public Product(String type, int sellIn, int quality) {
        if (quality > 50) {
            quality = 50;
        }
        this.type = type;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Product create(String type, int sellIn, int quality) {
        switch (type) {
            case "Aged Brie":
                return new AgedBrie(sellIn, quality);
            case "Sulfuras":
                return new Sulfuras(sellIn, quality);
            case "Backstage pass":
                return new BackstagePass(sellIn, quality);
            default:
                return new Product(type, sellIn, quality);
        }

    }

    public void passDays(int days) {
        for (int i = 0; i < days; i++) {
            updateQuality();
            sellIn--;
        }
    }

    private void updateQuality() {
        if (isExpired()) {
            updateQualityExpired();
        } else {
            updateQualityUnexpired();
        }
        if (quality < 0) {
            quality = 0;
        }
        quality = Math.min(quality, 50);
    }

    public void updateQualityUnexpired() {
        quality--;
    }

    public void updateQualityExpired() {
        quality -= 2;
    }

    private boolean isExpired() {
        return sellIn <= 0;
    }

    public int getQuality() {
        return quality;
    }
}
