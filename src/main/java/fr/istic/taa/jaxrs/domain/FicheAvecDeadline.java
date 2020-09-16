package fr.istic.taa.jaxrs.domain;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@DiscriminatorValue("D")
@XmlRootElement(name = "FicheAvecDeadline")
public class FicheAvecDeadline extends Fiche {

	private static final long serialVersionUID = -7154391038264630642L;
	
	private Date dateButoire;

	@XmlElement(name = "dateButoire")
	public Date getDateButoire() {
		return dateButoire;
	}

	public void setDateButoire(Date dateButoire) {
		this.dateButoire = dateButoire;
	}

	@Override
	public String toString() {
		return "FicheAvecDeadline [dateButoire=" + dateButoire + ", Id=" + getId() + ", Title=" + getTitle()
				+ ", user=" + getUser() + ", EstimatedTime=" + getEstimatedTime() + ", Tags=" + getTags()
				+ ", Lieu=" + getLieu() + ", Url=" + getUrl() + ", NoteExplicative="
				+ getNoteExplicative() + ", Section=" + getSection() + "]";
	}

	
}
