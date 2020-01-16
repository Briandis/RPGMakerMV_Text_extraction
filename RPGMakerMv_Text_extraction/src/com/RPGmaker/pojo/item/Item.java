
package com.RPGmaker.pojo.item;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class Item {

	private Integer id;
	private Integer animationId;
	private Damage damage;
	private String description;
	private List<Effects> effects;
	private Integer hitType;
	private Integer iconIndex;
	private String message1;
	private String message2;
	private Integer mpCost;
	private String name;
	private String note;
	private Integer occasion;
	private Integer repeats;
	private Integer requiredWtypeId1;
	private Integer requiredWtypeId2;
	private Integer scope;
	private Integer speed;
	private Integer stypeId;
	private Integer successRate;
	private Integer tpCost;
	private Integer tpGain;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnimationId() {
		return animationId;
	}

	public void setAnimationId(Integer animationId) {
		this.animationId = animationId;
	}

	public Damage getDamage() {
		return damage;
	}

	public void setDamage(Damage damage) {
		this.damage = damage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Effects> getEffects() {
		return effects;
	}

	public void setEffects(List<Effects> effects) {
		this.effects = effects;
	}

	public Integer getHitType() {
		return hitType;
	}

	public void setHitType(Integer hitType) {
		this.hitType = hitType;
	}

	public Integer getIconIndex() {
		return iconIndex;
	}

	public void setIconIndex(Integer iconIndex) {
		this.iconIndex = iconIndex;
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public Integer getMpCost() {
		return mpCost;
	}

	public void setMpCost(Integer mpCost) {
		this.mpCost = mpCost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getOccasion() {
		return occasion;
	}

	public void setOccasion(Integer occasion) {
		this.occasion = occasion;
	}

	public Integer getRepeats() {
		return repeats;
	}

	public void setRepeats(Integer repeats) {
		this.repeats = repeats;
	}

	public Integer getRequiredWtypeId1() {
		return requiredWtypeId1;
	}

	public void setRequiredWtypeId1(Integer requiredWtypeId1) {
		this.requiredWtypeId1 = requiredWtypeId1;
	}

	public Integer getRequiredWtypeId2() {
		return requiredWtypeId2;
	}

	public void setRequiredWtypeId2(Integer requiredWtypeId2) {
		this.requiredWtypeId2 = requiredWtypeId2;
	}

	public Integer getScope() {
		return scope;
	}

	public void setScope(Integer scope) {
		this.scope = scope;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getStypeId() {
		return stypeId;
	}

	public void setStypeId(Integer stypeId) {
		this.stypeId = stypeId;
	}

	public Integer getSuccessRate() {
		return successRate;
	}

	public void setSuccessRate(Integer successRate) {
		this.successRate = successRate;
	}

	public Integer getTpCost() {
		return tpCost;
	}

	public void setTpCost(Integer tpCost) {
		this.tpCost = tpCost;
	}

	public Integer getTpGain() {
		return tpGain;
	}

	public void setTpGain(Integer tpGain) {
		this.tpGain = tpGain;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}