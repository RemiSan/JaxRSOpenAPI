package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.domain.Tag;

public class TagDao extends AbstractDao<Long, Tag> {

	public TagDao() {
		super(Tag.class);
	}

}
