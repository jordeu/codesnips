package net.jordeu.codesnips.xsdcreator;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contact {
	
	private String name;
	private String surname;
	private Birthday birthday;
	private List<Mail> mail;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Birthday getBirthday() {
		return birthday;
	}
	public void setBirthday(Birthday birthday) {
		this.birthday = birthday;
	}
	public List<Mail> getMail() {
		return mail;
	}
	public void setMail(List<Mail> mail) {
		this.mail = mail;
	}

}
