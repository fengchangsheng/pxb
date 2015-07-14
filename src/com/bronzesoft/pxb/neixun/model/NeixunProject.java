package com.bronzesoft.pxb.neixun.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bronzesoft.pxb.platform.core.model.BaseModel;

@SuppressWarnings("serial")
@Entity
@Table(name = "t_Nex_Pjt")
public class NeixunProject extends BaseModel {

	@Column(name = "Name")
	private String name;
	
	@Column(name = "StartTime")
	private Date startTime;
	
	@Column(name = "EndTime")
	private Date endTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
}
