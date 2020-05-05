package cn.xpbootcamp.gilded_rose.manage;

import cn.xpbootcamp.gilded_rose.constant.GoodsEnum;
import cn.xpbootcamp.gilded_rose.model.Goods;

public class GoodsManagement {

    public Goods updateGoodsInfo(GoodsEnum goodsType, Goods goods) {
        switch (goodsType) {
            case COMMON_GOODS:
                goods =  manageCommonGoods(goods);
                break;
            case AGED_BRIE:
                goods = manageAgedBrie(goods);
                break;

            default:
                break;

        }
        return goods;
    }

    private Goods manageAgedBrie(Goods agedBrieGoods) {
        Integer quality = agedBrieGoods.getQuality();
        Integer passedDays = agedBrieGoods.getPassedDays();
        Integer decreaseSpeed = agedBrieGoods.getDecreaseSpeed();
        quality = quality - decreaseSpeed * passedDays;
        agedBrieGoods.setQuality(quality > 50 ? 50 : (quality < 0 ? 0 : quality));
        return agedBrieGoods;
    }

    private Goods manageCommonGoods(Goods commonGoods) {
        Integer sellIn = commonGoods.getSellIn();
        Integer quality = commonGoods.getQuality();
        Integer passedDays = commonGoods.getPassedDays();
        Integer decreaseSpeed = commonGoods.getDecreaseSpeed();
        if (sellIn-passedDays >= 0) {
            quality = quality-decreaseSpeed * passedDays;
        } else {
            quality = quality - decreaseSpeed * (sellIn + 2 * (passedDays - sellIn));
        }
        commonGoods.setSellIn(sellIn-passedDays);
        commonGoods.setQuality(quality >0 ? quality : 0);
        return commonGoods;
    }
}
