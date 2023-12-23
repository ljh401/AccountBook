package model.dto;

public class AccountbookDto {

	// member
	private int mno;
	private String mname;
	private int mid;
	private String mpwd;
	private String memail;
	
	// category
	private int cno;
	private String ccategory;
	
	// budget
	private int bno;
	private String bdate;
	private String bincome;
	private String bexpenses;
	private String bbalance;
	
	
	// 빈생성자
	public AccountbookDto() {
		// TODO Auto-generated constructor stub
	}

	// 풀생성자
	public AccountbookDto(int mno, String mname, int mid, String mpwd, String memail, int cno, String ccategory,
			int bno, String bdate, String bincome, String bexpenses, String bbalance) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.mid = mid;
		this.mpwd = mpwd;
		this.memail = memail;
		this.cno = cno;
		this.ccategory = ccategory;
		this.bno = bno;
		this.bdate = bdate;
		this.bincome = bincome;
		this.bexpenses = bexpenses;
		this.bbalance = bbalance;
	}

	
	// getter , setter
	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMpwd() {
		return mpwd;
	}

	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCcategory() {
		return ccategory;
	}

	public void setCcategory(String ccategory) {
		this.ccategory = ccategory;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getBincome() {
		return bincome;
	}

	public void setBincome(String bincome) {
		this.bincome = bincome;
	}

	public String getBexpenses() {
		return bexpenses;
	}

	public void setBexpenses(String bexpenses) {
		this.bexpenses = bexpenses;
	}

	public String getBbalance() {
		return bbalance;
	}

	public void setBbalance(String bbalance) {
		this.bbalance = bbalance;
	}


	// toString

	@Override
	public String toString() {
		return "AccountbookDto [mno=" + mno + ", mname=" + mname + ", mid=" + mid + ", mpwd=" + mpwd + ", memail="
				+ memail + ", cno=" + cno + ", ccategory=" + ccategory + ", bno=" + bno + ", bdate=" + bdate
				+ ", bincome=" + bincome + ", bexpenses=" + bexpenses + ", bbalance=" + bbalance + "]";
	}
	
	
	
	
	
}
