package br.ifrn.ssaac.business.facade;

import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.business.userbi.UserBI;

import br.ifrn.ssaac.business.model.Event;
import br.ifrn.ssaac.business.userbi.EventBI;

public class SSAACImp implements SSAAC {
	
	private UserBI userBI;
	private EventBI eventBI;
	
	public void setUserBI(UserBI userBI) {
		this.userBI = userBI;
	}

	public void setEventBI(EventBI userBI) {
		this.eventBI = eventBI;
	}
	
	@Override
	public void addStudentAuthor(Student student) {
		userBI.addStudentAuthor(student);
	}

	@Override
	public Event getEventDetails(long id) {
		return eventBI.getEventDetails(id);
	}
}