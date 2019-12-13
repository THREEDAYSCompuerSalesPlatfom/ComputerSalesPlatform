package com.THREEDAYS.POJO;

import java.math.BigInteger;

/**
 * @ClassNamecustomer
 * @Date2019-12-1320:39
 **/
public class Customer {

    BigInteger customerId;//买家I

    public BigInteger getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigInteger customerId) {
        this.customerId = customerId;
    }

    public String getCu_Telephone() {
        return cu_Telephone;
    }

    public void setCu_Telephone(String cu_Telephone) {
        this.cu_Telephone = cu_Telephone;
    }

    public String getCu_Address() {
        return cu_Address;
    }

    public void setCu_Address(String cu_Address) {
        this.cu_Address = cu_Address;
    }

    public String getCu_Name() {
        return cu_Name;
    }

    public void setCu_Name(String cu_Name) {
        this.cu_Name = cu_Name;
    }

    String cu_Telephone;//买家电话
    String cu_Address;//买家地址
    String cu_Name;//买家姓名
}
