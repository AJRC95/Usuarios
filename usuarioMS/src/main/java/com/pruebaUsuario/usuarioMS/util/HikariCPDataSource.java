package com.pruebaUsuario.usuarioMS.util;

import java.sql.Connection;
import java.sql.SQLException;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public final class HikariCPDataSource {
	private static HikariConfig config = new HikariConfig();
	private static HikariDataSource ds;

	// Configuracion de Base Datos
	static {
		config.setDriverClassName("oracle.jdbc.OracleDriver");
		config.setJdbcUrl("jdbc:oracle:thin:@hp00db00:1521:hpdesa");
		config.setUsername("fb_pkg");
		config.setPassword("pkg_bpgf");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		config.addDataSourceProperty("connectionTimeout", "5000");
		config.addDataSourceProperty("idleTimeout", "5000");
		config.addDataSourceProperty("maximumPoolSize", "6");
		ds = new HikariDataSource(config);
	}

	// Metodo Constructor
	private HikariCPDataSource() {
		super();
	}

	// Metodo de conexion
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
}