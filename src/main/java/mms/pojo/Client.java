package mms.pojo;

import java.sql.Date;

public class Client {

	private int cid;
	private String cno;// 编号cno：char(10)
	private String cname;// 姓名cname：nvarchar(8)
	private String csex;// 性别csex：nchar(1) 男 或 女
	private String cage;// 年龄cage：int(4)
	private String caddress;// 住址caddress：nvarchar(50)
	private String cphone;// 电话cphone：nvarchar(20)
	private String csymptom;// 症状csymptom：nvarchar(50)
	private String mno;// 已购药品mno：char(12)
	private String ano;// 经办人ano：char(8)
	private Date cdate;// 录入日期cdate：datetime(8)
	private String cremark;// 备注cremark：nvarchar(50)

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCsex() {
		return csex;
	}
	public void setCsex(String csex) {
		this.csex = csex;
	}
	
	public String getCage() {
		return cage;
	}
	public void setCage(String cage) {
		this.cage = cage;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getCsymptom() {
		return csymptom;
	}
	public void setCsymptom(String csymptom) {
		this.csymptom = csymptom;
	}
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public String getCremark() {
		return cremark;
	}
	public void setCremark(String cremark) {
		this.cremark = cremark;
	}
	

}
