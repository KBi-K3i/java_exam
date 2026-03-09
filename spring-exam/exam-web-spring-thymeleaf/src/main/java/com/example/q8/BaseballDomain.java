package com.example.q8;

import java.util.Date;

public class BaseballDomain {
	private Integer id;
	private String name;
	private Date establishedDate;
	private Integer stadiumId;

	public BaseballDomain(Integer id, String name, Date establishedDate, Integer stadiumId) {
		super();
		this.id = id;
		this.name = name;
		this.establishedDate = establishedDate;
		this.stadiumId = stadiumId;
	}
	
	public BaseballDomain() {}

	public Integer getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(Integer stadiumId) {
		this.stadiumId = stadiumId;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getEstablishedDate() {
		return establishedDate;
	}
	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}
}
