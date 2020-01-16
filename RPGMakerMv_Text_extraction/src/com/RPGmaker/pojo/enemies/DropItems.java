package com.RPGmaker.pojo.enemies;

import com.alibaba.fastjson.JSONObject;

public class DropItems {

	private Integer dataId;
	private Integer denominator;
	private Integer kind;

	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}

	public Integer getDataId() {
		return dataId;
	}

	public void setDenominator(Integer denominator) {
		this.denominator = denominator;
	}

	public Integer getDenominator() {
		return denominator;
	}

	public void setKind(Integer kind) {
		this.kind = kind;
	}

	public Integer getKind() {
		return kind;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}