package br.ifrn.ssaac.business.eventbi;

import br.ifrn.ssaac.business.model.Event;

public interface EventBI {
	public Event getEventDetails(long id);
}