package Students.service;

import java.util.Date;

public class Students {
private Integer sId;


private String sFn;
private String sLn;
private String sEmail;
private String sPhone;
private Date sBD;


  public Students() { super(); }
 
public Students(Integer sId, String sFn, String sLn, String sEmail, String sPhone, Date sBD) {
	super();
	this.sId = sId;
	this.sFn = sFn;
	this.sLn = sLn;
	this.sEmail = sEmail;
	this.sPhone = sPhone;
	this.sBD = sBD;
}

public Integer getsId() {
	return sId;
}

public void setsId(Integer sId) {
	this.sId = sId;
}

public String getsFn() {
	return sFn;
}

public void setsFn(String sFn) {
	this.sFn = sFn;
}

public String getsLn() {
	return sLn;
}

public void setsLn(String sLn) {
	this.sLn = sLn;
}

public String getsEmail() {
	return sEmail;
}

public void setsEmail(String sEmail) {
	this.sEmail = sEmail;
}

public String getsPhone() {
	return sPhone;
}

public void setsPhone(String sPhone) {
	this.sPhone = sPhone;
}

public Date getsBD() {
	return sBD;
}

public void setsBD(Date sBD) {
	this.sBD = sBD;
}

@Override
public String toString() {
	return "Students [sId=" + sId + ", sFn=" + sFn + ", sLn=" + sLn + ", sEmail=" + sEmail + ", sPhone=" + sPhone
			+ ", sBD=" + sBD + "]";
}
}
