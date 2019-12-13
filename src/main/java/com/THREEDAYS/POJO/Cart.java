package com.THREEDAYS.POJO;

import java.math.BigInteger;

/**
 * @ClassNamecart
 * @Date2019-12-1320:40
 **/
public class Cart {

    public BigInteger getCartId() {
        return cartId;
    }

    public void setCartId(BigInteger cartId) {
        this.cartId = cartId;
    }

    public BigInteger getLittleGoodsId() {
        return littleGoodsId;
    }

    public void setLittleGoodsId(BigInteger littleGoodsId) {
        this.littleGoodsId = littleGoodsId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    BigInteger cartId;//购物车Id
    BigInteger littleGoodsId;//具体商品Id
    int number;//商品数量
}
