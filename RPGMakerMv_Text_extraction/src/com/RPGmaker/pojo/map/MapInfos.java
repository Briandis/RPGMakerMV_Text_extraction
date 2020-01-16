package com.RPGmaker.pojo.map;

import com.alibaba.fastjson.JSONObject;

public class MapInfos {
	private Integer id;
	private boolean expanded;
	private String name;
	private Integer order;
	private Integer parentId;
	private Integer scrollX;
	private Integer scrollY;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isExpanded() {
		return expanded;
	}

	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getScrollX() {
		return scrollX;
	}

	public void setScrollX(Integer scrollX) {
		this.scrollX = scrollX;
	}

	public Integer getScrollY() {
		return scrollY;
	}

	public void setScrollY(Integer scrollY) {
		this.scrollY = scrollY;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
