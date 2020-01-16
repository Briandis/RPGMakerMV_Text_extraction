package com.RPGmaker.pojo.event;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class EventList {
	private Integer code;
	private Integer indent;
	private List<Object> parameters;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getIndent() {
		return indent;
	}

	public void setIndent(Integer indent) {
		this.indent = indent;
	}

//	public void setParameters(List<Parameter> parameters) {
//		this.parameters = parameters;
//	}
//
//	public List<Parameter> getParameters() {
//		return parameters;
//	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public List<Object> getParameters() {
		return parameters;
	}

	public void setParameters(List<Object> parameters) {
		this.parameters = parameters;
	}

}
