package com.RPGmaker.pojo.enemies;

import java.util.List;

public class Enemies {

	private Integer id;
	private List<Actions> actions;
	private Integer battlerHue;
	private String battlerName;
	private List<DropItems> dropItems;
	private Integer exp;
	private List<Traits> traits;
	private Integer gold;
	private String name;
	private String note;
	private List<Integer> params;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setActions(List<Actions> actions) {
		this.actions = actions;
	}

	public List<Actions> getActions() {
		return actions;
	}

	public void setBattlerHue(Integer battlerHue) {
		this.battlerHue = battlerHue;
	}

	public Integer getBattlerHue() {
		return battlerHue;
	}

	public void setBattlerName(String battlerName) {
		this.battlerName = battlerName;
	}

	public String getBattlerName() {
		return battlerName;
	}

	public void setDropItems(List<DropItems> dropItems) {
		this.dropItems = dropItems;
	}

	public List<DropItems> getDropItems() {
		return dropItems;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}

	public Integer getExp() {
		return exp;
	}

	public void setTraits(List<Traits> traits) {
		this.traits = traits;
	}

	public List<Traits> getTraits() {
		return traits;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public Integer getGold() {
		return gold;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public void setParams(List<Integer> params) {
		this.params = params;
	}

	public List<Integer> getParams() {
		return params;
	}

}