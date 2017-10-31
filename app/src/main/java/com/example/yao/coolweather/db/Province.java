package com.example.yao.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yao on 2017/10/31.
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName() {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode() {
        this.provinceCode = provinceCode;
    }
}
