package com.RPGmaker.pojo.event;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class MoveRoute {
	private List<EventList> list;
	private boolean repeat;
	private boolean skippable;
	private boolean wait;

	public List<EventList> getList() {
		return list;
	}

	public void setList(List<EventList> list) {
		this.list = list;
	}

	public boolean isRepeat() {
		return repeat;
	}

	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}

	public boolean isSkippable() {
		return skippable;
	}

	public void setSkippable(boolean skippable) {
		this.skippable = skippable;
	}

	public boolean isWait() {
		return wait;
	}

	public void setWait(boolean wait) {
		this.wait = wait;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
