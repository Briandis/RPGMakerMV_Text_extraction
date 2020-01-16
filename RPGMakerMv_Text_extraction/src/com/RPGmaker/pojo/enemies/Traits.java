package com.RPGmaker.pojo.enemies;

import com.alibaba.fastjson.JSONObject;

public class Traits {

	private Integer code;
	private Integer dataId;
	private Double value;

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}

	public Integer getDataId() {
		return dataId;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}
}