package net.jordeu.codesnips.xsdcreator;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Mail {

	public enum MailType { PERSONAL, WORK };
	
	private String email;
	private MailType type;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public MailType getType() {
		return type;
	}
	public void setType(MailType type) {
		this.type = type;
	}	
	
}
