package fr.istic.taa.jaxrs.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "User")
public class User implements Serializable{
	
	private static final long serialVersionUID = 619573215036108676L;

	private long id;
	
	private String name, mail;

	public User() {}
	
	public User(String name, String mail) {
		this.name = name;
		this.mail = mail;
	}

	@Id
	@GeneratedValue
	@XmlElement(name = "id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "mail")
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}
	
	
	
}
