package cn.xpbootcamp.gilded_rose.manage;

import cn.xpbootcamp.gilded_rose.constant.GoodsEnum;
import cn.xpbootcamp.gilded_rose.model.Goods;

public class GoodsManagement {

    public Goods updateGoodsInfo(GoodsEnum goodsType, Goods goods) {
        switch (goodsType) {
            case COMMON_GOODS:
                goods =  manageCommonGoods(goods);
                break;

            default:
                break;

        }
        return goods;
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
