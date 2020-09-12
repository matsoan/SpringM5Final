package com.matsoan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.matsoan.model.Profesional;


public class ProfesionalDAO {

	JdbcTemplate jdbcTemplate;

	public List<Profesional> list() {
		String sql = "SELECT * FROM PREVENCIONDB.PROFESIONALES";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Profesional>>() {
			@Override
			public List<Profesional> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Profesional> list = new ArrayList<Profesional>();
				while (rs.next()) {
					Profesional p = new Profesional();
					p.setPr_rut(rs.getString(1));
					p.setPr_nombres(rs.getString(2));
					p.setPr_apellidos(rs.getString(3));
					p.setPr_ocupacion(rs.getString(4));
					p.setPr_numero(rs.getString(5));
					p.setPr_email(rs.getNString(6));
					list.add(p);
				}
				return list;
			}
		});

	}

	public int save(Profesional prof) {
		String sql = "INSERT INTO PREVENCIONDB.PROFESIONALES VALUES('" + prof.getPr_rut() + "','" + prof.getPr_nombres()
				+ "','" + prof.getPr_apellidos() + "','" + prof.getPr_ocupacion() + "','" + prof.getPr_numero() + "','"
				+ prof.getPr_email() + "')";
		return jdbcTemplate.update(sql);
	}

	public int update(Profesional prof) {

		String sql = "UPDATE PREVENCIONDB.PROFESIONALES SET NOMBRES_PROF='"
				+ prof.getPr_nombres() + "', APELLIDOS_PROF='" + prof.getPr_apellidos() + "', OCUPACION_PROF='"
				+ prof.getPr_ocupacion() + "', NUMERO_PROF='" + prof.getPr_numero() + "', EMAIL_PROF='"
				+ prof.getPr_email() + "' WHERE RUT_PROF = '" + prof.getPr_rut() + "'";
		return jdbcTemplate.update(sql);
	}

	public int delete(String rut) {
		String sql = "DELETE FROM PREVENCIONDB.PROFESIONALES WHERE RUT_PROF='"+rut+"'";
		return jdbcTemplate.update(sql);
	}

	public Profesional getProfbyRut(String pr_rut) {
		String sql = "select * from PREVENCIONDB.PROFESIONALES where RUT_PROF=?";
		
		Profesional prof = (Profesional) jdbcTemplate.queryForObject(sql, new Object[] { pr_rut },
				new RowMapper<Profesional>() {
			
			public Profesional mapRow(ResultSet rs, int rowNum) throws SQLException {
				Profesional prof = new Profesional();
				prof.setPr_rut(rs.getString("RUT_PROF"));
				
				return prof;
			}
		});
		return prof;
				
				
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;

	}

}
