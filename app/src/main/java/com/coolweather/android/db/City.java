package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by admin on 2017/11/7.
 */

public class City extends DataSupport {
    private String id;
    private String cityName;
    private String cityCode;
    private String provinceId;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }
}
