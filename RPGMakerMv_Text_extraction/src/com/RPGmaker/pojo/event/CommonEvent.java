package com.RPGmaker.pojo.event;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class CommonEvent {
	private Integer id;
	private List<EventList> list;
	private String name;
	private Integer switchId;
	private Integer trigger;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<EventList> getList() {
		return list;
	}

	public void setList(List<EventList> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSwitchId() {
		return switchId;
	}

	public void setSwitchId(Integer switchId) {
		this.switchId = switchId;
	}

	public Integer getTrigger() {
		return trigger;
	}

	public void setTrigger(Integer trigger) {
		this.trigger = trigger;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
