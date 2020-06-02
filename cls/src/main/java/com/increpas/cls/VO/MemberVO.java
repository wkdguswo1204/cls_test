package com.increpas.cls.VO;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class MemberVO {
	private int mno, ano;
	private String name, id, pw, mail, gen, tel, sdate, avatar;
	private Date jdate;
	private Time jtime;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm");
		this.sdate = form1.format(jdate) + " " + form2.format(jtime);
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public .String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}
	public Time getJtime() {
		return jtime;
	}
	public void setJtime(Time jtime) {
		this.jtime = jtime;
	}
	
	
}
