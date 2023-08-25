package org.example.entity;

public class Product {
    private int sellIn;
    private int quality;

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
    public int updateProduct(int sellIn,int quality){
        if(sellIn <= 0){
            setQuality(--quality);
        }
        return sellIn;
    }
}
