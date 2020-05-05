package cn.xpbootcamp.gilded_rose.model;

public class Goods {
    private Integer sellIn;
    private Integer quality;
    private Integer passedDays;
    private Integer decreaseSpeed;

    public Goods(Integer sellIn, Integer quality, Integer passedDays, Integer decreaseSpeed) {
        this.sellIn = sellIn;
        this.quality = quality;
        this.passedDays = passedDays;
        this.decreaseSpeed = decreaseSpeed;
    }

    public Integer getSellIn() {
        return sellIn;
    }

    public void setSellIn(Integer sellIn) {
        this.sellIn = sellIn;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Integer getPassedDays() {
        return passedDays;
    }

    public void setPassedDays(Integer passedDays) {
        this.passedDays = passedDays;
    }

    public Integer getDecreaseSpeed() {
        return decreaseSpeed;
    }

    public void setDecreaseSpeed(Integer decreaseSpeed) {
        this.decreaseSpeed = decreaseSpeed;
    }
}
