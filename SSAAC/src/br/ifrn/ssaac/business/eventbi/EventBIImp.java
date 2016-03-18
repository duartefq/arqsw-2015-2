package br.ifrn.ssaac.business.eventbi;

import br.ifrn.ssaac.business.model.Event;
import br.ifrn.ssaac.persistence.dao.EventDAO;
import br.ifrn.ssaac.persistence.dao.EventDAOImp;

public class EventBIImp implements EventBI {

	private EventDAO dao = new EventDAOImp();
	
	public EventBIImp() {
	}

	@Override
	public Event getEventDetails(long id) {
		return dao.getEvent(id);
	}
}