package com.matsoan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.matsoan.model.Cliente;


public class ClienteDAO {
	JdbcTemplate jdbcTemplate;

	public List<Cliente> list() {
		String sql = "SELECT * FROM PREVENCIONDB.CLIENTES";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Cliente>>() {
			@Override
			public List<Cliente> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Cliente> list = new ArrayList<Cliente>();
				while (rs.next()) {
					Cliente c = new Cliente();
					c.setCl_rut(rs.getString(1));
					c.setCl_nombre(rs.getString(2));
					c.setCl_rubro(rs.getString(3));
					c.setCl_email(rs.getString(4));
					c.setCl_numero(rs.getString(5));
					c.setCl_desc(rs.getNString(6));
					c.setCl_ubi(rs.getNString(7));
					list.add(c);
				}
				return list;

			}
		});
	}

	public int save(Cliente c) {
		String sql = "INSERT INTO PREVENCIONDB.CLIENTES VALUES('" + c.getCl_rut() + "','" + c.getCl_nombre() + "','"
				+ c.getCl_rubro() + "','" + c.getCl_numero() + "','" + c.getCl_email() + "','" + c.getCl_desc() + "','"
				+ c.getCl_ubi() + "')";
		return jdbcTemplate.update(sql);
	}

	public int update(Cliente c) {

		String sql = "UPDATE PREVENCIONDB.CLIENTES SET RUT_CLIENT='" + c.getCl_rut() + "', NOMBRE_CLIENT='"
				+ c.getCl_nombre() + "', RUBRO_CLIENT='" + c.getCl_rubro() + "', NUMERO_CLIENT='" + c.getCl_numero()
				+ "', EMAIL_CLIENT='" + c.getCl_email() + "', DESCRIPCION_CLIENT='" + c.getCl_desc()
				+ "', UBICACION_CLIENT='" + c.getCl_ubi() + "' WHERE RUT_CLIENT = '" + c.getCl_rut() + "'";
		return jdbcTemplate.update(sql);
	}

	public int delete(String rut) {
		String sql = "DELETE FROM PREVENCIONDB.CLIENTES WHERE RUT_CLIENT='" + rut + "'";
		return jdbcTemplate.update(sql);
	}

	public Cliente getClientbyRut(String cl_rut) {
		String sql = "select * from PREVENCIONDB.CLIENTES where RUT_CLIENT=?";

		Cliente c = (Cliente) jdbcTemplate.queryForObject(sql, new Object[] { cl_rut }, new RowMapper<Cliente>() {

			public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
				Cliente c = new Cliente();
				c.setCl_rut(rs.getString("RUT_CLIENT"));

				return c;
			}
		});
		return c;

	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;

	}

}