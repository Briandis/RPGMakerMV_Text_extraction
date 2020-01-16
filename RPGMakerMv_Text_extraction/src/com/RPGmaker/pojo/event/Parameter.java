package com.RPGmaker.pojo.event;

public class Parameter {
	public Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	@Override
	public String toString() {
		if (object == null) {
			return null;
		} else {
			return object.toString();
		}
	}

}
