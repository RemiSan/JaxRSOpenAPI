package fr.istic.taa.jaxrs.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "Tag")
public class Tag implements Serializable {
	
	private static final long serialVersionUID = 210595189965861011L;

	private long id;
	
	private String name;

	public Tag() {}
	
	public Tag(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Tag [id=" + id + ", name=" + name + "]";
	}
}
