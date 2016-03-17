package br.ifrn.ssaac.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ifrn.ssaac.business.model.Event;
import br.ifrn.ssaac.persistence.util.ConnectionFactory;

public class EventDAOImp implements EventDAO {
	private Connection conn;

	public EventDAOImp() {
		conn = ConnectionFactory.getInstance().getConnection();
	}

	@Override
	public Event getEvent(long id) {
		try {
			String sql = "SELECT * FROM event WHERE id = ?";
			PreparedStatement pstSelect = conn.prepareStatement(sql);
			pstSelect.setLong(1, id);
			ResultSet rs = pstSelect.executeQuery();

			while (rs.next()) {
				String nome = rs.getString("nome");
				String local = rs.getString("local");

				return new Event(nome, local);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
