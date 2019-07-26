package moh.model;
import java.util.Date;
public class SacemReg {
	private String reference;
	private Date date;
	
	public SacemReg(String reference, Date date) {
		super();
		this.reference = reference;
		this.date = date;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "SacemReg [reference=" + reference + ", date=" + date + "]";
	}

}
