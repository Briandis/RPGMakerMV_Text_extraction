package com.RPGmaker.pojo.event;

import java.util.List;

import com.RPGmaker.pojo.map.Image;
import com.alibaba.fastjson.JSONObject;

public class Page {

	private Conditions conditions;
	private boolean directionFix;
	private Image image;
	private List<EventList> list;
	private Integer moveFrequency;
	private MoveRoute moveRoute;
	private Integer moveSpeed;
	private Integer moveType;
	private Integer priorityType;
	private boolean stepAnime;
	private boolean through;
	private Integer trigger;
	private boolean walkAnime;

	public Conditions getConditions() {
		return conditions;
	}

	public void setConditions(Conditions conditions) {
		this.conditions = conditions;
	}

	public boolean isDirectionFix() {
		return directionFix;
	}

	public void setDirectionFix(boolean directionFix) {
		this.directionFix = directionFix;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public List<EventList> getList() {
		return list;
	}

	public void setList(List<EventList> list) {
		this.list = list;
	}

	public Integer getMoveFrequency() {
		return moveFrequency;
	}

	public void setMoveFrequency(Integer moveFrequency) {
		this.moveFrequency = moveFrequency;
	}

	public MoveRoute getMoveRoute() {
		return moveRoute;
	}

	public void setMoveRoute(MoveRoute moveRoute) {
		this.moveRoute = moveRoute;
	}

	public Integer getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(Integer moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	public Integer getMoveType() {
		return moveType;
	}

	public void setMoveType(Integer moveType) {
		this.moveType = moveType;
	}

	public Integer getPriorityType() {
		return priorityType;
	}

	public void setPriorityType(Integer priorityType) {
		this.priorityType = priorityType;
	}

	public boolean isStepAnime() {
		return stepAnime;
	}

	public void setStepAnime(boolean stepAnime) {
		this.stepAnime = stepAnime;
	}

	public boolean isThrough() {
		return through;
	}

	public void setThrough(boolean through) {
		this.through = through;
	}

	public Integer getTrigger() {
		return trigger;
	}

	public void setTrigger(Integer trigger) {
		this.trigger = trigger;
	}

	public boolean isWalkAnime() {
		return walkAnime;
	}

	public void setWalkAnime(boolean walkAnime) {
		this.walkAnime = walkAnime;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
