package com.RPGmaker.pojo.map;

import com.alibaba.fastjson.JSONObject;

public class Bgm {
	private String name;
	private Integer pan;
	private Integer pitch;
	private Integer volume;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPan() {
		return pan;
	}

	public void setPan(Integer pan) {
		this.pan = pan;
	}

	public Integer getPitch() {
		return pitch;
	}

	public void setPitch(Integer pitch) {
		this.pitch = pitch;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
