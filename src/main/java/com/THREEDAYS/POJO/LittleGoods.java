package com.THREEDAYS.POJO;

import java.math.BigInteger;

/**
 * @ClassNameLittleGoods
 * @Date2019-12-1320:52
 **/
public class LittleGoods {
    BigInteger littleGoodsId;
    BigInteger bigGoodsId;
    String edition;
    BigInteger sellerId;

    public BigInteger getLittleGoodsId() {
        return littleGoodsId;
    }

    public void setLittleGoodsId(BigInteger littleGoodsId) {
        this.littleGoodsId = littleGoodsId;
    }

    public BigInteger getBigGoodsId() {
        return bigGoodsId;
    }

    public void setBigGoodsId(BigInteger bigGoodsId) {
        this.bigGoodsId = bigGoodsId;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public BigInteger getSellerId() {
        return sellerId;
    }

    public void setSellerId(BigInteger sellerId) {
        this.sellerId = sellerId;
    }


}
