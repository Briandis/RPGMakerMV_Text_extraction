package com.RPGmaker.pojo.item;

public class Damage {

	private boolean critical;
	private Integer elementId;
	private String formula;
	private Integer type;
	private Integer variance;

	public void setCritical(boolean critical) {
		this.critical = critical;
	}

	public boolean getCritical() {
		return critical;
	}

	public void setElementId(Integer elementId) {
		this.elementId = elementId;
	}

	public Integer getElementId() {
		return elementId;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getFormula() {
		return formula;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return type;
	}

	public void setVariance(Integer variance) {
		this.variance = variance;
	}

	public Integer getVariance() {
		return variance;
	}

}