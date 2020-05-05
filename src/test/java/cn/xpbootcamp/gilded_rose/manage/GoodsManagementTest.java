package cn.xpbootcamp.gilded_rose.manage;

import cn.xpbootcamp.gilded_rose.constant.GoodsEnum;
import cn.xpbootcamp.gilded_rose.model.Goods;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GoodsManagementTest {
    private GoodsManagement goodsManagement = new GoodsManagement();

    @Test
    public void should_decreased_quality_normally_when_remain_sellin_above_zero_given_common_goods_information() {
        // given
        Goods goods = new Goods(50, 100, 40, 1);

        // when
        Goods actualResult = goodsManagement.updateGoodsInfo(GoodsEnum.COMMON_GOODS, goods);

        // then
        Integer expectQuality = 60;
        Integer expectSellIn = 10;
        Assertions.assertEquals(expectQuality, actualResult.getQuality());
        Assertions.assertEquals(expectSellIn, actualResult.getSellIn());
    }

    @Test
    public void should_decreased_quality_normally_when_remain_sellin_below_zero_given_common_goods_information() {
        // given
        Goods goods = new Goods(50, 100, 60, 1);

        // when
        Goods actualResult = goodsManagement.updateGoodsInfo(GoodsEnum.COMMON_GOODS, goods);

        // then
        Integer expectQuality = 30;
        Integer expectSellIn = -10;
        Assertions.assertEquals(expectQuality, actualResult.getQuality());
        Assertions.assertEquals(expectSellIn, actualResult.getSellIn());
    }

    @Test
    public void should_increased_quality_normally_when_quality_below_50_given_aged_brie_goods_information() {
        // given
        Goods goods = new Goods(Integer.MAX_VALUE, 10, 10, -1);

        // when
        Goods actualResult = goodsManagement.updateGoodsInfo(GoodsEnum.AGED_BRIE, goods);

        // then
        Integer expectQuality = 20;
        Assertions.assertEquals(expectQuality, actualResult.getQuality());
    }

    @Test
    public void should_quality_be_50_when_quality_above_50_given_aged_brie_goods_information() {
        // given
        Goods goods = new Goods(Integer.MAX_VALUE, 10, 60, -1);

        // when
        Goods actualResult = goodsManagement.updateGoodsInfo(GoodsEnum.AGED_BRIE, goods);

        // then
        Integer expectQuality = 50;
        Assertions.assertEquals(expectQuality, actualResult.getQuality());
    }

    @Test
    public void should_quality_not_change_when_given_Sulfuras_goods_information() {
        // given
        Goods goods = new Goods(null, 10, 10, 0);

        // when
        Goods actualResult = goodsManagement.updateGoodsInfo(GoodsEnum.SULFURAS, goods);

        // then
        Integer expectQuality = 10;
        Assertions.assertEquals(expectQuality, actualResult.getQuality());
    }
}
