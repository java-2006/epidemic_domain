package com.yueqian.epidemic_domain.domain;

import java.util.Date;

public class EpidemicsVO {
	/*
	 * serial_id, province_id, epi_date, affirmed, suspect,
	 *  outbound, dead,cured,user_id,input_date

	 */
	private int serialId;
	private ProvinceVO prov;
	private Date epiDate;
	//确诊人数确诊人数
	private Integer affirmed;
	//疑似人数
	private Integer suspect;
	//境外输入
	private Integer outbound;
	//死亡人数
	private Integer dead;
	//治愈人数
	private Integer cured;
	private UsersVO user;
	private Date inputDate;
	public int getSerialId() {
		return serialId;
	}
	public void setSerialId(int serialId) {
		this.serialId = serialId;
	}
	public ProvinceVO getProv() {
		return prov;
	}
	public void setProv(ProvinceVO prov) {
		this.prov = prov;
	}
	public Date getEpiDate() {
		return epiDate;
	}
	public void setEpiDate(Date epiDate) {
		this.epiDate = epiDate;
	}
	public Integer getAffirmed() {
		return affirmed;
	}
	public void setAffirmed(Integer affirmed) {
		this.affirmed = affirmed;
	}
	public Integer getSuspect() {
		return suspect;
	}
	public void setSuspect(Integer suspect) {
		this.suspect = suspect;
	}
	public Integer getOutbound() {
		return outbound;
	}
	public void setOutbound(Integer outbound) {
		this.outbound = outbound;
	}
	public Integer getDead() {
		return dead;
	}
	public void setDead(Integer dead) {
		this.dead = dead;
	}
	public Integer getCured() {
		return cured;
	}
	public void setCured(Integer cured) {
		this.cured = cured;
	}
	public UsersVO getUser() {
		return user;
	}
	public void setUser(UsersVO user) {
		this.user = user;
	}
	public Date getInputDate() {
		return inputDate;
	}
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	public EpidemicsVO(int serialId, ProvinceVO prov, Date epiDate, Integer affirmed, Integer suspect, Integer outbound,
			Integer dead, Integer cured, UsersVO user, Date inputDate) {
		super();
		this.serialId = serialId;
		this.prov = prov;
		this.epiDate = epiDate;
		this.affirmed = affirmed;
		this.suspect = suspect;
		this.outbound = outbound;
		this.dead = dead;
		this.cured = cured;
		this.user = user;
		this.inputDate = inputDate;
	}
	public EpidemicsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static EpidemicsVO getFallbackInstance() {
		return new EpidemicsVO(-1, ProvinceVO.getFallbackInstance(), new Date(), 0, 0, 0, 0, 0, UsersVO.getFallbackInstance(),new Date());
	}

}
