package com.RPGmaker.pojo.event;

import com.alibaba.fastjson.JSONObject;

public class Conditions {

	private Integer actorId;
	private boolean actorValid;
	private Integer itemId;
	private boolean itemValid;
	private String selfSwitchCh;
	private boolean selfSwitchValid;
	private Integer switch1Id;
	private boolean switch1Valid;
	private Integer switch2Id;
	private boolean switch2Valid;
	private Integer variableId;
	private boolean variableValid;
	private Integer variableValue;

	public Integer getActorId() {
		return actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	public boolean isActorValid() {
		return actorValid;
	}

	public void setActorValid(boolean actorValid) {
		this.actorValid = actorValid;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public boolean isItemValid() {
		return itemValid;
	}

	public void setItemValid(boolean itemValid) {
		this.itemValid = itemValid;
	}

	public String getSelfSwitchCh() {
		return selfSwitchCh;
	}

	public void setSelfSwitchCh(String selfSwitchCh) {
		this.selfSwitchCh = selfSwitchCh;
	}

	public boolean isSelfSwitchValid() {
		return selfSwitchValid;
	}

	public void setSelfSwitchValid(boolean selfSwitchValid) {
		this.selfSwitchValid = selfSwitchValid;
	}

	public Integer getSwitch1Id() {
		return switch1Id;
	}

	public void setSwitch1Id(Integer switch1Id) {
		this.switch1Id = switch1Id;
	}

	public boolean isSwitch1Valid() {
		return switch1Valid;
	}

	public void setSwitch1Valid(boolean switch1Valid) {
		this.switch1Valid = switch1Valid;
	}

	public Integer getSwitch2Id() {
		return switch2Id;
	}

	public void setSwitch2Id(Integer switch2Id) {
		this.switch2Id = switch2Id;
	}

	public boolean isSwitch2Valid() {
		return switch2Valid;
	}

	public void setSwitch2Valid(boolean switch2Valid) {
		this.switch2Valid = switch2Valid;
	}

	public Integer getVariableId() {
		return variableId;
	}

	public void setVariableId(Integer variableId) {
		this.variableId = variableId;
	}

	public boolean isVariableValid() {
		return variableValid;
	}

	public void setVariableValid(boolean variableValid) {
		this.variableValid = variableValid;
	}

	public Integer getVariableValue() {
		return variableValue;
	}

	public void setVariableValue(Integer variableValue) {
		this.variableValue = variableValue;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
