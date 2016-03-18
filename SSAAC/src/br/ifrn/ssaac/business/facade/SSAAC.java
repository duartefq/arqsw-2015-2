package br.ifrn.ssaac.business.facade;

import br.ifrn.ssaac.business.model.Student;

public interface SSAAC {
	public void addStudentAuthor(Student student);

	public Event getEventDetails(long id);
}