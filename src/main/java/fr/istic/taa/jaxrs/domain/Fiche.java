package fr.istic.taa.jaxrs.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("F")
@XmlRootElement(name = "Fiche")
public class Fiche implements Serializable{
	
	private static final long serialVersionUID = 9096491566260173254L;

	private long id;
	
	private String title;
	
	private User user;
	
	private int estimatedTime;
	
	private List<Tag> tags;
	
	private String lieu;
	
	private String url;
	
	private String noteExplicative;

	private Section section;

	public Fiche() {}

	@Id
	@GeneratedValue
	@XmlElement(name = "id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@XmlElement(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	@ManyToOne
	@XmlElement(name = "user")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@XmlElement(name = "estimatedTime")
	public int getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	@OneToMany
	@XmlElementWrapper(name = "tags")
	@XmlElement(name = "tag")
	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	@XmlElement(name = "lieu")
	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	@XmlElement(name = "url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@XmlElement(name = "noteExplicative")
	public String getNoteExplicative() {
		return noteExplicative;
	}

	public void setNoteExplicative(String noteExplicative) {
		this.noteExplicative = noteExplicative;
	}

	@ManyToOne
	@XmlElement(name = "section")
	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
	
	@Override
	public String toString() {
		return "Fiche [id=" + id + ", title=" + title + ", user=" + user
				+ ", estimatedTime=" + estimatedTime + ", tags=" + tags + ", lieu=" + lieu + ", url=" + url
				+ ", noteExplicative=" + noteExplicative + ", section=" + section + "]";
	}

}
