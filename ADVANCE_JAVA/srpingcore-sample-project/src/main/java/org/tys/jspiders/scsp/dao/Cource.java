package org.tys.jspiders.scsp.dao;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cource {
	private String courceName;
	private Float fee;

//	public Cource() {
//		super();
//
//	}
//
//	public Cource(String courceName, Float fee) {
//		super();
//		this.courceName = courceName;
//		this.fee = fee;
//	}

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	public Float getFee() {
		return fee;
	}

	public void setFee(Float fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Cource [courceName=" + courceName + ", fee=" + fee + "]";
	}

}
