package com.yueqian.epidemic_domain.domain;

public class ProvinceVO {
	/*
	 * province_id, province_name, province_py
	 */
	private int provinceId;
	private String provinceName;
	private String provincePy;
	
	public static ProvinceVO getFallbackInstance() {
		return new ProvinceVO(-1, "降级处理省份名称", "jjcl");
	}
	public ProvinceVO() {
		super();
	}
	public ProvinceVO(int provinceId, String provinceName, String provincePy) {
		super();
		this.provinceId = provinceId;
		this.provinceName = provinceName;
		this.provincePy = provincePy;
	}
	public int getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvincePy() {
		return provincePy;
	}
	public void setProvincePy(String provincePy) {
		this.provincePy = provincePy;
	}

}
