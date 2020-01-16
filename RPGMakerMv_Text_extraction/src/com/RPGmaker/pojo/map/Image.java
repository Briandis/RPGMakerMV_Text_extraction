package com.RPGmaker.pojo.map;

import com.alibaba.fastjson.JSONObject;

public class Image {
	private Integer characterIndex;
	private String characterName;
	private Integer direction;
	private Integer pattern;
	private Integer tileId;

	public Integer getCharacterIndex() {
		return characterIndex;
	}

	public void setCharacterIndex(Integer characterIndex) {
		this.characterIndex = characterIndex;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	public Integer getPattern() {
		return pattern;
	}

	public void setPattern(Integer pattern) {
		this.pattern = pattern;
	}

	public Integer getTileId() {
		return tileId;
	}

	public void setTileId(Integer tileId) {
		this.tileId = tileId;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
