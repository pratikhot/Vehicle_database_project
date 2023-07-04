package com.example.demo.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle 
{
     @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vid;
    private String vname;
    private Double vprice;
    private String vmodel;
    private String vcolor;
	public Long getVid() {
		return vid;
	}
	public void setVid(Long vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Double getVprice() {
		return vprice;
	}
	public void setVprice(Double vprice) {
		this.vprice = vprice;
	}
	public String getVmodel() {
		return vmodel;
	}
	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}
	public String getVcolor() {
		return vcolor;
	}
	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", vprice=" + vprice + ", vmodel=" + vmodel + ", vcolor="
				+ vcolor + "]";
	}
    
    

	




}
