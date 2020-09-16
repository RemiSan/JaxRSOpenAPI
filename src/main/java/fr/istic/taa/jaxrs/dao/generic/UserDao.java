package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.domain.User;

public class UserDao extends AbstractDao<Long, User> {

	public UserDao() {
		super(User.class);
	}

}
