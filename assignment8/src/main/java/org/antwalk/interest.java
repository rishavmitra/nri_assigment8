package org.antwalk;

public class interest {
	private float princ;
	private float rate;
	private float time;
	
	
	
	public float getPrinc() {
		return princ;
	}



	public void setPrinc(float princ) {
		this.princ = princ;
	}



	public float getRate() {
		return rate;
	}



	public void setRate(float rate) {
		this.rate = rate;
	}



	public float getTime() {
		return time;
	}



	public void setTime(float time) {
		this.time = time;
	}



	public float SimInt() {
		return (princ*rate*time/100);
	}
}
