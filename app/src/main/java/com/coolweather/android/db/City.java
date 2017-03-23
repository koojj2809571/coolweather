package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by OPP on 2017/3/23.
 */

public class City extends DataSupport {
    private int id;
    private String cituName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCituName() {
        return cituName;
    }

    public void setCituName(String cituName) {
        this.cituName = cituName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
