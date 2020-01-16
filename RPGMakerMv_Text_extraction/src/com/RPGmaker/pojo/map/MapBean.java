package com.RPGmaker.pojo.map;

import java.util.List;

import com.RPGmaker.pojo.event.Event;
import com.alibaba.fastjson.JSONObject;

public class MapBean {

	private boolean autoplayBgm;
	private boolean autoplayBgs;
	private String battleback1Name;
	private String battleback2Name;
	private Bgm bgm;
	private Bgs bgs;
	private List<Integer> data;
	private boolean disableDashing;
	private String displayName;
	private Integer encounterStep;
	private Integer height;
	private String note;
	private boolean parallaxLoopX;
	private boolean parallaxLoopY;
	private String parallaxName;
	private boolean parallaxShow;
	private Integer parallaxSx;
	private Integer parallaxSy;
	private Integer scrollType;
	private boolean specifyBattleback;
	private Integer tilesetId;
	private Integer width;

	private List<String> encounterList;
	private List<Event> events;

	public boolean isAutoplayBgm() {
		return autoplayBgm;
	}

	public void setAutoplayBgm(boolean autoplayBgm) {
		this.autoplayBgm = autoplayBgm;
	}

	public boolean isAutoplayBgs() {
		return autoplayBgs;
	}

	public void setAutoplayBgs(boolean autoplayBgs) {
		this.autoplayBgs = autoplayBgs;
	}

	public String getBattleback1Name() {
		return battleback1Name;
	}

	public void setBattleback1Name(String battleback1Name) {
		this.battleback1Name = battleback1Name;
	}

	public String getBattleback2Name() {
		return battleback2Name;
	}

	public void setBattleback2Name(String battleback2Name) {
		this.battleback2Name = battleback2Name;
	}

	public Bgm getBgm() {
		return bgm;
	}

	public void setBgm(Bgm bgm) {
		this.bgm = bgm;
	}

	public Bgs getBgs() {
		return bgs;
	}

	public void setBgs(Bgs bgs) {
		this.bgs = bgs;
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}

	public boolean isDisableDashing() {
		return disableDashing;
	}

	public void setDisableDashing(boolean disableDashing) {
		this.disableDashing = disableDashing;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Integer getEncounterStep() {
		return encounterStep;
	}

	public void setEncounterStep(Integer encounterStep) {
		this.encounterStep = encounterStep;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isParallaxLoopX() {
		return parallaxLoopX;
	}

	public void setParallaxLoopX(boolean parallaxLoopX) {
		this.parallaxLoopX = parallaxLoopX;
	}

	public boolean isParallaxLoopY() {
		return parallaxLoopY;
	}

	public void setParallaxLoopY(boolean parallaxLoopY) {
		this.parallaxLoopY = parallaxLoopY;
	}

	public String getParallaxName() {
		return parallaxName;
	}

	public void setParallaxName(String parallaxName) {
		this.parallaxName = parallaxName;
	}

	public boolean isParallaxShow() {
		return parallaxShow;
	}

	public void setParallaxShow(boolean parallaxShow) {
		this.parallaxShow = parallaxShow;
	}

	public Integer getParallaxSx() {
		return parallaxSx;
	}

	public void setParallaxSx(Integer parallaxSx) {
		this.parallaxSx = parallaxSx;
	}

	public Integer getParallaxSy() {
		return parallaxSy;
	}

	public void setParallaxSy(Integer parallaxSy) {
		this.parallaxSy = parallaxSy;
	}

	public Integer getScrollType() {
		return scrollType;
	}

	public void setScrollType(Integer scrollType) {
		this.scrollType = scrollType;
	}

	public boolean isSpecifyBattleback() {
		return specifyBattleback;
	}

	public void setSpecifyBattleback(boolean specifyBattleback) {
		this.specifyBattleback = specifyBattleback;
	}

	public Integer getTilesetId() {
		return tilesetId;
	}

	public void setTilesetId(Integer tilesetId) {
		this.tilesetId = tilesetId;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public List<String> getEncounterList() {
		return encounterList;
	}

	public void setEncounterList(List<String> encounterList) {
		this.encounterList = encounterList;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
