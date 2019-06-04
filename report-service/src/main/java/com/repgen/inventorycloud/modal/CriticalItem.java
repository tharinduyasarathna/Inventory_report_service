package com.repgen.inventorycloud.modal;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.boot.archive.spi.ArchiveException;
import org.springframework.http.HttpStatus;


public class CriticalItem {
	
	private Long id;
    private String name;
	private String brand;
	private String uOm;
	private Integer quentity;
	private Integer criticalLevel;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getuOm() {
		return uOm;
	}
	public void setuOm(String uOm) {
		this.uOm = uOm;
	}
	public Integer getQuentity() {
		return quentity;
	}
	public void setQuentity(Integer quentity) {
		this.quentity = quentity;
	}
	public Integer getCriticalLevel() {
		return criticalLevel;
	}
	public void setCriticalLevel(Integer criticalLevel) {
		this.criticalLevel = criticalLevel;
	}


}
