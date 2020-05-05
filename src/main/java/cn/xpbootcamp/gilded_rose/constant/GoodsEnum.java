package cn.xpbootcamp.gilded_rose.constant;

public enum GoodsEnum {
    COMMON_GOODS("Common Goods"),
    AGED_BRIE("Aged Brie"),
    SULFURAS("Sulfuras"),
    BACKSTAGE_PASS("Backstage pass");

    GoodsEnum(String name) {
        this.name = name;
    }

    private String name;

}
