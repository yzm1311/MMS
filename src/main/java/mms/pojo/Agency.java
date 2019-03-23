package mms.pojo;

public class Agency {

	private int aid;
	private String ano; 	// 编号ano：char(8)
	private String aname;   // 姓名aname：char(8)
	private String asex;    // 性别asex：nchar(1) 男 或 女
	private String aphone;  // 电话aphone：char(12)
	private String aremark; // 备注aremark：varchar(50)

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAsex() {
		return asex;
	}

	public void setAsex(String asex) {
		this.asex = asex;
	}

	public String getAphone() {
		return aphone;
	}

	public void setAphone(String aphone) {
		this.aphone = aphone;
	}

	public String getAremark() {
		return aremark;
	}

	public void setAremark(String aremark) {
		this.aremark = aremark;
	}

	@Override
	public String toString() {
		return "Agency [ano=" + ano + ", aname=" + aname + ", asex=" + asex + ", aphone=" + aphone + ", aremark="
				+ aremark + "]";
	}

}
