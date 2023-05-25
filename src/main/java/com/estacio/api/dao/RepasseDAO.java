package com.estacio.api.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.estacio.api.connection.ConnectionFactory;
import com.estacio.api.model.Repasse;

public class RepasseDAO {
	ConnectionFactory conBD = null;

	public RepasseDAO() {
		conBD = new ConnectionFactory();
	}
	
	public List<Repasse> findAll(){
		
		List<Repasse> repasses = null;
		
		try {
			String sql = "select municipio.nome_municipio, tiporepasse.nome_tiporepasse, repasse.mes, repasse.ano, repasse.valor_repasse_no_mes, repasse.valor_repasse_ate_mes \r\n"
					+ "from repasse \r\n"
					+ "inner join municipio on municipio.id_municipio = repasse.id_municipio\r\n"
					+ "inner join tiporepasse on tiporepasse.id_tiporepasse = repasse.id_tiporepasse";

			PreparedStatement ps = conBD.iniciarConexao().prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			repasses = new ArrayList<Repasse>();;
			
			while(rs.next()) {
				Repasse repasse = new Repasse();
				
				repasse.setMunicipio(rs.getString(1));
				repasse.setTipoRepasse(rs.getString(2));
				repasse.setAno(rs.getInt(3));
				repasse.setMes(rs.getInt(4));
				repasse.setValorRepasseNoMes(rs.getDouble(5));
				repasse.setValorRepasseAteMes(rs.getDouble(6));
				
				repasses.add(repasse);
			}
			
			return repasses;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return repasses;
	}
	
	public Repasse findByMunicipio(Integer idMunicipio) {
		
		try {
			String sql = "select municipio.nome_municipio, tiporepasse.nome_tiporepasse, repasse.mes, repasse.ano, repasse.valor_repasse_no_mes, repasse.valor_repasse_ate_mes \r\n"
					+ "from repasse \r\n"
					+ "inner join municipio on municipio.id_municipio = repasse.id_municipio\r\n"
					+ "inner join tiporepasse on tiporepasse.id_tiporepasse = repasse.id_tiporepasse "
					+ "where repasse.id_municipio = ?";
			
			PreparedStatement ps = conBD.iniciarConexao().prepareStatement(sql);
			
			ps.setInt(1, idMunicipio);
			
			ResultSet rs = ps.executeQuery();
			
			Repasse repasse = null;
			
			while(rs.next()) {
				repasse = new Repasse();
				
				repasse.setMunicipio(rs.getString(1));
				repasse.setTipoRepasse(rs.getString(2));
				repasse.setAno(rs.getInt(3));
				repasse.setMes(rs.getInt(4));
				repasse.setValorRepasseNoMes(rs.getDouble(5));
				repasse.setValorRepasseAteMes(rs.getDouble(6));
			}
			
			return repasse;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
