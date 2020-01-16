package com.RPGmaker.pojo.enemies;

import com.alibaba.fastjson.JSONObject;

public class Actions {

	private Integer conditionParam1;
	private Integer conditionParam2;
	private Integer conditionType;
	private Integer rating;
	private Integer skillId;

	public Integer getConditionParam1() {
		return conditionParam1;
	}

	public void setConditionParam1(Integer conditionParam1) {
		this.conditionParam1 = conditionParam1;
	}

	public Integer getConditionParam2() {
		return conditionParam2;
	}

	public void setConditionParam2(Integer conditionParam2) {
		this.conditionParam2 = conditionParam2;
	}

	public Integer getConditionType() {
		return conditionType;
	}

	public void setConditionType(Integer conditionType) {
		this.conditionType = conditionType;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}