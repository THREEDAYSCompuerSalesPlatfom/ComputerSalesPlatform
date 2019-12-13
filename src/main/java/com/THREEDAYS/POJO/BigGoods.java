package com.THREEDAYS.POJO;

import java.math.BigInteger;

/**
 * @ClassNameBiggoods
 * @Date2019-12-1320:39
 **/
public class BigGoods {
    public BigInteger getBigGoodsId() {
        return bigGoodsId;
    }

    public void setBigGoodsId(BigInteger bigGoodsId) {
        this.bigGoodsId = bigGoodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    BigInteger bigGoodsId;//
    String goodsName;
}
