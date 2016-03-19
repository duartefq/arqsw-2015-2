package br.ifrn.ssaac.persistence.dao;

import br.ifrn.ssaac.business.model.Event;

public interface EventDAO {
	public Event getEvent(long id);
}
